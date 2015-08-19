package org.nasdanika.html.impl;

import java.util.ArrayList;
import java.util.List;

import org.nasdanika.html.Dropdown;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.Tag;
import org.nasdanika.html.UIElement;

class DropdownImpl extends UIElementImpl<DropdownImpl> implements Dropdown<DropdownImpl> {
	private static Object DIVIDER = new Object(); // Marker object.
	
	private UIElement<?> toggle;
	private List<Object> items = new ArrayList<>();
	private String tagName;

	DropdownImpl(HTMLFactory factory, String tagName, UIElement<?> toggle) {
		super(factory);
		this.tagName = tagName;
		this.toggle = toggle;
	}
	
	private class Header implements AutoCloseable {
		Object header;
		
		Header(Object header) {
			this.header = header;
		}
		
		@Override
		public void close() throws Exception {
			UIElementImpl.close(header);				
		}
	}

	@Override
	public DropdownImpl item(Object... item) {
		items.add(factory.fragment(item));
		return this;
	}

	@Override
	public DropdownImpl divider() {
		items.add(DIVIDER);
		return this;
	}
	
	@Override
	public String toString() {
		Tag dropdownTag = factory.tag(tagName).addClass("dropdown");
		dropdownTag.content(toggle.addClass("dropdown-toggle").attribute("data-toggle", "dropdown"));
		Tag ul = factory.tag("ul").addClass("dropdown-menu");
		dropdownTag.content(ul);
        for (Object item: items) {
        	if (item==DIVIDER) {
        		ul.content(factory.tag("li", "").addClass("divider"));
        	} else if (item instanceof Header) {
        		ul.content(factory.tag("li", ((Header) item).header).addClass("dropdown-header"));
        	} else {
        		ul.content(factory.tag("li", item));
        	}
        }
		return dropdownTag.toString()+genLoadRemoteContentScript();
	}

	@Override
	public DropdownImpl header(Object header) {
		items.add(new Header(header));
		return this;
	}
	
	@Override
	public void close() throws Exception {
		close(toggle);
		for (Object item: items) {
			close(item);
		}
	}

	@Override
	public boolean isDropdownEmpty() {
		return items.isEmpty();
	}
	
}