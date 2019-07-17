/*******************************************************************************
 * Copyright (c) 2019 Oak Ridge National Laboratory.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the LICENSE
 * which accompanies this distribution
 ******************************************************************************/
package dbwr.widgets;

import java.io.PrintWriter;

import org.w3c.dom.Element;

import dbwr.parser.WidgetFactory;

public class TextEntryWidget extends BaseTextWidget
{
    static
    {
        WidgetFactory.registerLegacy("org.csstudio.opibuilder.widgets.TextInput", "textentry");
        WidgetFactory.addJavaScript("textentry.js");
        WidgetFactory.addCSS("textentry.css");
    }

	public TextEntryWidget(final ParentWidget parent, final Element xml) throws Exception
	{
		super(parent, xml, "textentry", "#7FF");

        attributes.put("type", "text");
        attributes.put("value", "<" + pv_name + ">");

	}

    @Override
    protected String getHTMLElement()
    {
        return "input";
    }

    @Override
    protected void fillHTML(final PrintWriter html, final int indent)
    {
//        html.append("<input type=\"text\" value=\"");
//        HTMLUtil.escape(html, "<" + pv_name + ">");
//        html.append("\"/>");
    }
}
