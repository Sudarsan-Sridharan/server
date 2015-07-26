package org.nasdanika.cdo.web.doc;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.core.runtime.IConfigurationElement;
import org.nasdanika.cdo.web.doc.DocRoute.ExtensionEntry;
import org.nasdanika.core.CoreUtil;
import org.nasdanika.core.Topic;

public class TocNodeFactory {
	
	private String name;
	private String id;
	private String icon;
	private String location;
	private String content;
	private String linkTo;		
	private List<String> links = new ArrayList<>();
	private List<TocNodeFactory> children = new ArrayList<>();
	private Topic topic;
	
	public TocNodeFactory(
			String docBaseURL,
			String docRoutePath,
			Map<Object, Object> contentFilterEnv,
			String contributorName,
			Map<String, Map<String, DocRoute.ExtensionEntry<ContentFilter>>> contentFilters,
			IConfigurationElement iConfigurationElement) throws Exception {
		
		ContentFilter textFilter = new ContentFilter() {

			@Override
			public Object filter(Object content, Map<Object, Object> env) {
				return "<div style=\"white-space:pre-wrap; font-family:monospace\">"+StringEscapeUtils.escapeHtml4(String.valueOf(content))+"</div>";
			}

		};
		
		Map<String, DocRoute.ExtensionEntry<ContentFilter>> tm = contentFilters.get("text/plain");
		if (tm!=null) {
			ExtensionEntry<ContentFilter> ee = tm.get("text/html");
			textFilter = ee==null ? null : ee.extension;
		}
		
		ContentFilter markdownFilter = new ContentFilter() {

			@Override
			public Object filter(Object content, Map<Object, Object> env) {
				return "<H1>Cannot convert markdown to HTML</H1><div style=\"white-space:pre-wrap; font-family:monospace\">"+StringEscapeUtils.escapeHtml4(String.valueOf(content))+"</div>";
			}

		};
		
		tm = contentFilters.get("text/markdown");
		if (tm!=null) {
			ExtensionEntry<ContentFilter> ee = tm.get("text/html");
			markdownFilter = ee==null ? null : ee.extension;
		}
		
		URL baseURL = new URL(docBaseURL+"/bundle/"+contributorName+"/");
		name = iConfigurationElement.getAttribute("name");
		id = iConfigurationElement.getAttribute("id");
		if (id!=null) {
			id = contributorName+"/"+id;
		}
		icon = iConfigurationElement.getAttribute("icon");
		if (icon!=null) {
			icon = new URL(baseURL, icon).toString();
			if (icon.startsWith(docBaseURL)) {
				icon=icon.substring(docBaseURL.length());
			}
		}
		
		if (iConfigurationElement.getAttribute("class")==null) {
			location = iConfigurationElement.getAttribute("location");
			if (location==null) {
				IConfigurationElement[] contentElements = iConfigurationElement.getChildren("markdown");
				if (contentElements.length==0) {
					contentElements = iConfigurationElement.getChildren("text");
					if (contentElements.length==0) {
						contentElements = iConfigurationElement.getChildren("html");
						if (contentElements.length!=0) {
							content = contentElements[0].getValue();
						}
					} else {
						content = (String) textFilter.filter(contentElements[0].getValue(), contentFilterEnv);
					}
				} else {
					content = (String) markdownFilter.filter(contentElements[0].getValue(), contentFilterEnv);
				}
			} else {
				location = new URL(baseURL, location).toString();
				if (location.startsWith(docBaseURL)) {
					location = location.substring(docBaseURL.length());
				}
			}
		} else {
			topic = CoreUtil.injectProperties(iConfigurationElement, (Topic) iConfigurationElement.createExecutableExtension("class"));
		}
		
		linkTo = iConfigurationElement.getAttribute("linkTo");
		for (IConfigurationElement link: iConfigurationElement.getChildren("link")) {
			links.add(link.getAttribute("id"));
		}
		
		for (IConfigurationElement child: iConfigurationElement.getChildren("topic")) {
			children.add(new TocNodeFactory(
					docBaseURL, 
					docRoutePath, 
					contentFilterEnv,
					contributorName, 
					contentFilters, 
					child));
		}
	}

	public void createTocNode(TocNode parent, List<TocNodeFactory> tocNodeFactories, boolean merge) {
		boolean doSort = false;
		TocNode node = parent;
		if (!merge) {
			node = parent.createChild(name, location, icon);
			if (topic!=null) {
				node.setContent(topic.getContent());
			} else if (content!=null) {
				node.setContent(content);
			}
		}
		
		if (topic!=null) {
			Map<String, Topic> subTopics = topic.getSubTopics();
			if (subTopics!=null && !subTopics.isEmpty()) {
				doSort = !children.isEmpty();
				for (Entry<String, Topic> ste: subTopics.entrySet()) {
					createTocNode(node, ste.getKey(), ste.getValue());
				}
			}
		}
		
		for (TocNodeFactory child: children) {
			child.createTocNode(node, tocNodeFactories, false);
		}
		for (String link: links) {
			TocNodeFactory linkedChild = find(link);
			if (linkedChild!=null) {
				linkedChild.createTocNode(node, tocNodeFactories, true);
				doSort = true;
			}
		}
		for (TocNodeFactory tnf: tocNodeFactories) {
			for (TocNodeFactory linked: tnf.findLinked(id)) {
				linked.createTocNode(node, tocNodeFactories, true);
				doSort = true;
			}
		}
		if (doSort) {
			node.sort(false);
		}
	}
	
	private void createTocNode(TocNode parent, String name, Topic topic) {
		TocNode node = parent.createChild(name, null, topic.getIcon());					
		node.setContent(topic.getContent());
		
		Map<String, Topic> subTopics = topic.getSubTopics();
		if (subTopics!=null && !subTopics.isEmpty()) {
			for (Entry<String, Topic> ste: subTopics.entrySet()) {
				createTocNode(node, ste.getKey(), ste.getValue());
			}
		}		
	}
	
	private List<TocNodeFactory> findLinked(String linkTo) {
		List<TocNodeFactory> linked = new ArrayList<>();
		if (this.linkTo!=null && this.linkTo.equals(linkTo)) {
			linked.add(this);
		}
		for (TocNodeFactory child: children) {
			linked.addAll(child.findLinked(linkTo));
		}
		return linked;
	}
	
	private TocNodeFactory find(String id) {
		if (this.id!=null && this.id.equals(id)) {
			return this;
		}
		for (TocNodeFactory child: children) {
			TocNodeFactory ret = child.find(id);
			if (ret!=null) {
				return ret;
			}
		}
		return null;
	}
	
	private boolean isLinking(String id) {
		if (id==null) {
			return false;
		}
		for (String link: links) {
			if (id.equals(link)) {
				return true;
			}
		}
		for (TocNodeFactory child: children) {
			if (child.isLinking(id)) {
				return true;
			}
		}
		return false;
	}

	public boolean isRoot(List<TocNodeFactory> tocNodeFactories) {
		if (linkTo!=null) {
			for (TocNodeFactory tnf: tocNodeFactories) {
				if (tnf.find(linkTo)!=null || (id!=null && tnf.isLinking(id))) {
					return false;
				}
			}
		}
				
		return true;
	}

}
