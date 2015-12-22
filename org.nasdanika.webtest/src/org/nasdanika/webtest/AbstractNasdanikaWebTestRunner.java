package org.nasdanika.webtest;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONObject;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Base class for test runners which report results to {@link Collector}.
 * @author Pavel Vlasov
 *
 */
public abstract class AbstractNasdanikaWebTestRunner extends BlockJUnit4ClassRunner implements TestResultSource {
	
	private static final int SCREENSHOT_ATTEMPTS = 5;

	private static final int SCREENSHOT_RETAKE_WAIT_INTERVAL = 2000;

	static ThreadLocal<Collector<WebDriver>> collectorThreadLocal = new ThreadLocal<Collector<WebDriver>>() {
		
		protected Collector<WebDriver> initialValue() {
			// NOP Collector to avoid exceptions.
			return new Collector<WebDriver>() {

				@Override
				public void onPageProxying(Page<WebDriver> page) {}

				@Override
				public void beforePageMethod(Page<WebDriver> page, byte[] screenshot, JSONObject performanceData, Method method, Object[] args) {}

				@Override
				public void afterPageMethod(Page<WebDriver> page, byte[] screenshot, JSONObject performanceData, Method method, Object[] args, Object result, Throwable th) {}

				@Override
				public void onActorProxying(Actor<WebDriver> actor) {}

				@Override
				public void beforeActorMethod(Actor<WebDriver> actor, byte[] screenshot, JSONObject performanceData, Method method, Object[] args) {}

				@Override
				public void afterActorMethod(Actor<WebDriver> actor, byte[] screenshot, JSONObject performanceData, Method method, Object[] args, Object result, Throwable th) {}

				@Override
				public void beforeTestMethod(Method method, int index, Object[] parameters) {}

				@Override
				public void beforeTestMethodScreenshot(byte[] screenshot, JSONObject performanceData) {}

				@Override
				public void afterTestMethod(Method method, Throwable th) {}

				@Override
				public void afterTestMethodScreenshot(byte[] screenshot, JSONObject performanceData) {}

				@Override
				public void close() throws Exception {}

				@Override
				public void setTest(Object test) {}

				@Override
				public void beforePageInitialization(
						Class<? extends Page<WebDriver>> pageClass,
						byte[] screenshot, 
						JSONObject performanceData) {}

				@Override
				public void afterPageInitialization(
						Class<? extends Page<WebDriver>> pageClass, 
						Page<WebDriver> page, 
						byte[] screenshot, 
						JSONObject performanceData, 
						Throwable th) {}

				@Override
				public void onScreenshot(byte[] screenshot, String comment) {}
				
			};
		};
		
	};
	
	static ThreadLocal<Object> testThreadLocal = new ThreadLocal<Object>();
	private static ThreadLocal<List<ServiceTracker<?,?>>> serviceTrackersThreadLocal = new ThreadLocal<List<ServiceTracker<?,?>>>() {
		
		protected java.util.List<ServiceTracker<?,?>> initialValue() {
			return new ArrayList<ServiceTracker<?,?>>();
		};
	};
	
	static JSONObject capturePerformance() {
		Object test = testThreadLocal.get();
		if (test instanceof WebTest) {
			return WebTestUtil.capturePerformance(((WebTest<?>) test).getWebDriver());
		}
		return null;
	}
	
	static byte[] takeScreenshot() {
		Object test = testThreadLocal.get();
		if (test instanceof TakesScreenshot) { // To customize screenshot taking in some advanced situations
			takeScreenshot((TakesScreenshot) test);
		}
		if (test instanceof WebTest) {
			WebDriver webDriver = ((WebTest<?>) test).getWebDriver();
			if (webDriver instanceof TakesScreenshot) {
				return takeScreenshot((TakesScreenshot) webDriver);
			}
		}
		return null;
	}
	
	private static byte[] takeScreenshot(TakesScreenshot takesScreenshot) {
		String takeScreenshots = System.getenv("NASDANIKA_WEBTEST_TAKE_SCREENSHOTS");
		if ("no".equalsIgnoreCase(takeScreenshots) || "false".equalsIgnoreCase(takeScreenshots)) {
			return null;
		}
		
		if (takeScreenshots!=null && !"yes".equalsIgnoreCase(takeScreenshots) && !"true".equalsIgnoreCase(takeScreenshots)) {
			System.err.println("Invalid value of NASDANIKA_WEBTEST_TAKE_SCREENSHOTS environment variable: "+takeScreenshots);
		}
		
		try {
			for (int i=0; ; ++i) {
				try {
					return takesScreenshot.getScreenshotAs(OutputType.BYTES);
				} catch (WebDriverException wde) {
					if (i<SCREENSHOT_ATTEMPTS && wde.getMessage()!=null && wde.getMessage().startsWith("Could not take screenshot of current page - Error: Page is not loaded yet, try later")) {							
						try {
							System.out.println("Retaking screenshot");
							Thread.sleep(SCREENSHOT_RETAKE_WAIT_INTERVAL); // Wait and retry.
						} catch (InterruptedException e) {
							return null; 
						}
					} else {
						throw wde;
					}
				} 
			}
		} catch (Exception e) {
			System.err.println("Error taking screenshot: "+e);
			e.printStackTrace();
		}
		
		return null;
	}
	
	static boolean shallTakeBeforeScreenshot(Screenshot screenshotAnnotation) {
		return screenshotAnnotation==null || Arrays.asList(screenshotAnnotation.value()).contains(Screenshot.When.BEFORE); 
	}
	
	static boolean shallTakeAfterScreenshot(Screenshot screenshotAnnotation) {
		return screenshotAnnotation==null || Arrays.asList(screenshotAnnotation.value()).contains(Screenshot.When.AFTER); 
	}
	
	static boolean shallTakeExceptionScreenshot(Screenshot screenshotAnnotation) {
		return screenshotAnnotation==null || Arrays.asList(screenshotAnnotation.value()).contains(Screenshot.When.EXCEPTION); 
	}
	
	protected TestResultCollector testResultCollector;

	protected AbstractNasdanikaWebTestRunner(Class<?> klass) throws InitializationError {
		super(klass);
	}

	@Override
	public void setTestResultCollector(TestResultCollector testResultCollector) {
		this.testResultCollector = testResultCollector;		
	}
		
	static void delete(File file) throws IOException {
		if (file.exists()) {
			if (file.isDirectory()) {
				for (File c: file.listFiles()) {
					delete(c);
				}
			}
			if (!file.delete()) {
				throw new IOException("Output directory cleanup failed - could not delete "+file.getAbsolutePath());				
			}
		} 
	}	
	
	protected abstract Collector<WebDriver> createCollector(TestResultCollector testResultCollector) throws Exception;
			
	@Override
	public void run(RunNotifier notifier) {
		try {
			Collector<WebDriver> prevCollector = collectorThreadLocal.get();
			collectorThreadLocal.set(createCollector(testResultCollector));
			try {
				super.run(notifier);
			} finally {
				collectorThreadLocal.get().close();
				collectorThreadLocal.set(prevCollector);				
			}
		} catch (Exception e) {			
			System.err.println("Report generation failed: "+e);
			e.printStackTrace();
		}
	}

	static File configOutputDir(Class<?> klass) throws IOException {
		Report reportAnnotation = klass.getAnnotation(Report.class);
		String outputDirTemplate = reportAnnotation==null ? "target/nasdanika-web-tests/{2}" : reportAnnotation.outputDir();
		String className = klass.getName();
		String shortClassName = className.substring(className.lastIndexOf('.')+1);
		String outputDirName = MessageFormat.format(outputDirTemplate.replace('/', File.separatorChar), new Object[] {shortClassName, className, className.replace('.', File.separatorChar)});
		File outputDir = new File(outputDirName);						
		if (outputDir.exists()) {
			for (File c: outputDir.listFiles()) {
				delete(c);
			}
		} else if (!outputDir.mkdirs()) {
			throw new IOException("Could not create output directory "+outputDir.getAbsolutePath());
		}
		return outputDir;
	}
	
	@Override
	protected Statement methodBlock(final FrameworkMethod method) {
		final Statement superStatement =  super.methodBlock(method);
		return new Statement() {

			@Override
			public void evaluate() throws Throwable {
		    	boolean isPending = false;
		    	Pending pendingAnnotation = method.getMethod().getAnnotation(Pending.class);
		    	if (pendingAnnotation!=null) {
		    		String until = pendingAnnotation.until();
		    		if (until.trim().length()==0) {
		    			isPending = true; // No expiration date - ignore the test
		    		} else {
		    			try {
		    				isPending = new SimpleDateFormat("yyyy-MM-dd").parse(until).getTime() > System.currentTimeMillis();
		    			} catch (ParseException e) {
		    				System.err.println("Invalid until date: "+until);
		    			}
		    		}
		    		
		    	}
				if (!isPending) {
			    	collectorThreadLocal.get().beforeTestMethod(method.getMethod(), getIndex(), getParameters());
			    	try {
			    		superStatement.evaluate();
			    		collectorThreadLocal.get().afterTestMethod(method.getMethod(), null);
			    	} catch (Throwable th) {
			    		collectorThreadLocal.get().afterTestMethod(method.getMethod(), th);
			    		throw th;
			    	} finally {
			    		// Close service trackers if any
			    		for (ServiceTracker<?,?> st: serviceTrackersThreadLocal.get()) {
			    			st.close();
			    		}
			    		
			    		serviceTrackersThreadLocal.get().clear();
			    	}
				}
			}
			
		};
	}
	
	private static final Object[] NO_PARAMETERS = {};
	
	/**
	 * @return Test parameters if test is parameterized.
	 */
	protected Object[] getParameters() {
		return NO_PARAMETERS;
	}
	
	protected int getIndex() {
		return -1;
	}
	
	@Override
	protected Statement methodInvoker(final FrameworkMethod method, final Object test) {
		injectFactoriesAndServices(test);
		
		return new Statement() {

		    @Override
		    public void evaluate() throws Throwable {
	    		Method theMethod = method.getMethod();
	    		Screenshot screenshotAnnotation = theMethod.getAnnotation(Screenshot.class);
	    		long delay = screenshotAnnotation==null ? 0 : screenshotAnnotation.delay();
	    		if (test instanceof WebTest) {
	    			delay += ((WebTest<?>) test).getScreenshotDelay();
	    		}
		    	try {				    		
		    		testThreadLocal.set(test);
		    		collectorThreadLocal.get().setTest(test);
		    		if (test instanceof WebTest) {
		    			WebTestUtil.doWait(((WebTest<?>) test).getWebDriver(), theMethod);
		    		}
		    		if (shallTakeBeforeScreenshot(screenshotAnnotation)) {
		    			if (delay>0) {
		    				Thread.sleep(delay);
		    			}
		    			collectorThreadLocal.get().beforeTestMethodScreenshot(takeScreenshot(), capturePerformance());
		    		} else {
		    			collectorThreadLocal.get().beforeTestMethodScreenshot(null, capturePerformance());		    			
		    		}
			    	method.invokeExplosively(test);
		    		if (shallTakeAfterScreenshot(screenshotAnnotation)) {
		    			if (delay>0) {
		    				Thread.sleep(delay);
		    			}
		    			collectorThreadLocal.get().afterTestMethodScreenshot(takeScreenshot(), capturePerformance());
		    		} else {
		    			collectorThreadLocal.get().afterTestMethodScreenshot(null, capturePerformance());
		    		}
		    	} catch (Throwable th) {
		    		if (shallTakeExceptionScreenshot(screenshotAnnotation)) {
		    			if (delay>0) {
		    				Thread.sleep(delay);
		    			}
		    			collectorThreadLocal.get().afterTestMethodScreenshot(takeScreenshot(), capturePerformance());
		    		} else {
		    			collectorThreadLocal.get().afterTestMethodScreenshot(null, capturePerformance());		    			
		    		}
		    		throw th;
		    	} finally {
		    		testThreadLocal.set(null);
		    	}
		    }
		    
		};
	}

	@SuppressWarnings("unchecked")
	private void injectFactoriesAndServices(final Object test) {
		try {
			BundleContext bundleContext = FrameworkUtil.getBundle(test.getClass()).getBundleContext();
			if (bundleContext==null) {
				throw new NullPointerException("Cannot acquire bundle context for class "+test.getClass());
			}
			for (Field field: test.getClass().getFields()) {
				ActorFactory afa = field.getAnnotation(ActorFactory.class);
				if (afa!=null) {
					if (afa.filter().trim().length()==0) {
						ServiceTracker<Object,Object> st = new ServiceTracker<Object,Object>(bundleContext, (Class<Object>) field.getType(), null);
						st.open();
						serviceTrackersThreadLocal.get().add(st);
						field.set(test, WebTestUtil.proxyActorFactory(st.waitForService(2000)));
					} else {
						String filter = "(&(" + Constants.OBJECTCLASS + "=" + field.getType().getName() + ")"+MessageFormat.format(afa.filter(), getParameters())+")";
						ServiceTracker<Object,Object> st = new ServiceTracker<Object,Object>(bundleContext,	filter,	null);
						st.open();
						serviceTrackersThreadLocal.get().add(st);
						field.set(test, WebTestUtil.proxyActorFactory(st.waitForService(2000)));
					}
				} else {
					PageFactory pfa = field.getAnnotation(PageFactory.class);
					if (pfa!=null) {
						if (pfa.filter().trim().length()==0) {
							ServiceTracker<Object,Object> st = new ServiceTracker<Object,Object>(bundleContext, (Class<Object>) field.getType(), null);
							st.open();
							serviceTrackersThreadLocal.get().add(st);
							field.set(test, WebTestUtil.proxyPageFactory(st.waitForService(2000)));
						} else {
							String filter = "(&(" + Constants.OBJECTCLASS + "=" + field.getType().getName() + ")"+MessageFormat.format(pfa.filter(), getParameters())+")";
							ServiceTracker<Object,Object> st = new ServiceTracker<Object,Object>(bundleContext,	filter,	null);
							st.open();
							serviceTrackersThreadLocal.get().add(st);
							field.set(test, WebTestUtil.proxyPageFactory(st.waitForService(2000)));
						}
					} else {
						Service sa = field.getAnnotation(Service.class);
						if (sa!=null) {
							if (sa.filter().trim().length()==0) {
								ServiceTracker<Object,Object> st = new ServiceTracker<Object,Object>(bundleContext, (Class<Object>) field.getType(), null);
								st.open();
								serviceTrackersThreadLocal.get().add(st);
								field.set(test, st.waitForService(2000));
							} else {
								String filter = "(&(" + Constants.OBJECTCLASS + "=" + field.getType().getName() + ")"+MessageFormat.format(sa.filter(), getParameters())+")";
								ServiceTracker<Object,Object> st = new ServiceTracker<Object,Object>(bundleContext,	filter,	null);
								st.open();
								serviceTrackersThreadLocal.get().add(st);
								field.set(test, st.waitForService(2000));
							}
						}						
					}
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("Factroy injection failed: "+e, e);
		}			
	}

	@SuppressWarnings("unchecked")
	public static <D extends WebDriver> void beforePageInitialization(D driver, Class<? extends Page<D>> pageClass) {
		Screenshot screenshotAnnotation = pageClass.getAnnotation(Screenshot.class);
		long delay = screenshotAnnotation==null ? 0 : screenshotAnnotation.delay();
		Object test = testThreadLocal.get();
		if (test instanceof WebTest) {
			delay += ((WebTest<?>) test).getScreenshotDelay();
		}
		if (shallTakeBeforeScreenshot(screenshotAnnotation)) {
			if (delay>0) {
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} 
			if (driver instanceof TakesScreenshot) {
				((Collector<D>) collectorThreadLocal.get()).beforePageInitialization(pageClass, takeScreenshot((TakesScreenshot) driver), WebTestUtil.capturePerformance(driver));
			}
		} else {
			((Collector<D>) collectorThreadLocal.get()).beforePageInitialization(pageClass, null, WebTestUtil.capturePerformance(driver));
		}
	}

	@SuppressWarnings("unchecked")
	public static <D extends WebDriver> void afterPageInitialization(
			WebDriver driver,
			Class<? extends Page<D>> pageClass, 
			Page<D> page,
			Throwable th) {
		Screenshot screenshotAnnotation = pageClass.getAnnotation(Screenshot.class);
		long delay = screenshotAnnotation==null ? 0 : screenshotAnnotation.delay();
		Object test = testThreadLocal.get();
		if (test instanceof WebTest) {
			delay += ((WebTest<?>) test).getScreenshotDelay();
		}
		if (th==null) {
			if (shallTakeAfterScreenshot(screenshotAnnotation)) {
				if (delay>0) {
					try {
						Thread.sleep(delay);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (driver instanceof TakesScreenshot) {
					((Collector<D>) collectorThreadLocal.get()).afterPageInitialization(pageClass, page, takeScreenshot((TakesScreenshot) driver), WebTestUtil.capturePerformance(driver), null);
				}
			} else {
				((Collector<D>) collectorThreadLocal.get()).afterPageInitialization(pageClass, page, null, WebTestUtil.capturePerformance(driver), null);
			}
		} else {
			if (shallTakeExceptionScreenshot(screenshotAnnotation)) {
				if (delay>0) {
					try {
						Thread.sleep(delay);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (driver instanceof TakesScreenshot) {
					((Collector<D>) collectorThreadLocal.get()).afterPageInitialization(pageClass, page, takeScreenshot((TakesScreenshot) driver), WebTestUtil.capturePerformance(driver), th);
				}
			} else {
				((Collector<D>) collectorThreadLocal.get()).afterPageInitialization(pageClass, page, null, WebTestUtil.capturePerformance(driver), th);
			}			
		}
	}
	
}
