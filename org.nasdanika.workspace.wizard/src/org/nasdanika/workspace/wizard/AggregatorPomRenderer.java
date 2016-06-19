package org.nasdanika.workspace.wizard;

public class AggregatorPomRenderer {


  protected static String nl;
  public static synchronized AggregatorPomRenderer create(String lineSeparator)
  {
    nl = lineSeparator;
    AggregatorPomRenderer result = new AggregatorPomRenderer();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<project" + NL + "\txsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\"" + NL + "\txmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" + NL + "\t<modelVersion>4.0.0</modelVersion>" + NL + "\t<groupId>";
  protected final String TEXT_2 = "</groupId>" + NL + "\t<artifactId>";
  protected final String TEXT_3 = ".aggregator</artifactId>" + NL + "\t<version>";
  protected final String TEXT_4 = "-SNAPSHOT</version>" + NL + "\t<name>";
  protected final String TEXT_5 = " Aggregator</name>" + NL + "\t<packaging>pom</packaging>" + NL + "\t" + NL + " \t<build>" + NL + "\t\t<plugins>" + NL + "\t\t\t<plugin>" + NL + "\t\t\t\t<groupId>org.apache.maven.plugins</groupId>" + NL + "\t\t\t\t<artifactId>maven-javadoc-plugin</artifactId>" + NL + "\t\t\t\t<version>2.10.4</version>" + NL + "\t\t\t\t<configuration>" + NL + "\t  \t        \t<reportOutputDirectory>${basedir}/../";
  protected final String TEXT_6 = "/apidocs</reportOutputDirectory>" + NL + "\t\t\t\t\t<linksource>true</linksource>" + NL + "\t\t\t\t\t<failOnError>false</failOnError>" + NL + "\t\t            <links>" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.boxing/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.function/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.h2/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.promise/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.sca/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.sca.edit/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.scheduler/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.security/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.security.edit/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.security.editor/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.web/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.web.doc/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.core/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.core.tests/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.function.cdo/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.function/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.html/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.sca.design/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.sca.edit/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.sca.editor/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.sca/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.tools.design/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.web/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.webtest.performance/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.webtest/apidocs</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://www.nasdanika.org/server/apidocs/org.nasdanika.workspace.wizard/apidocs</link>" + NL + "\t\t\t\t\t\t<!--\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t<link>http://docs.oracle.com/javase/8/docs/api</link>\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t-->" + NL + "\t\t            </links>" + NL + "\t\t\t\t\t<detectLinks>true</detectLinks>\t\t\t\t\t" + NL + "\t\t\t\t</configuration>" + NL + "\t\t\t</plugin>" + NL + "\t\t</plugins>" + NL + "\t</build>" + NL + "\t" + NL + "\t<modules>" + NL + "\t";
  protected final String TEXT_7 = NL + "\t\t<module>../";
  protected final String TEXT_8 = "</module>" + NL + "\t";
  protected final String TEXT_9 = NL + "\t</modules>" + NL + "</project>";
  protected final String TEXT_10 = NL;

public String generate(org.nasdanika.workspace.wizard.AbstractWorkspaceWizard wizard) throws Exception
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(wizard.getGroupId());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(wizard.getGroupId());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(wizard.getVersion());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(wizard.getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(wizard.getDocArtifactId());
    stringBuffer.append(TEXT_6);
     for (String module: wizard.getModules()) { 
    stringBuffer.append(TEXT_7);
    stringBuffer.append(module);
    stringBuffer.append(TEXT_8);
     } 
    stringBuffer.append(TEXT_9);
    stringBuffer.append(TEXT_10);
    return stringBuffer.toString();
  }
}