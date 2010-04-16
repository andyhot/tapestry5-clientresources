package org.got5.tapestry5.clientresources.test.pages;

import org.apache.tapestry5.RenderSupport;
import org.apache.tapestry5.annotations.AfterRender;
import org.apache.tapestry5.ioc.annotations.Inject;

public class Index
{
    @Inject
    private RenderSupport support;

    @AfterRender
    void addScript()
    {
	support.addScript("true;");
    }

}
