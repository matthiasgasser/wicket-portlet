package org.apache.wicket.portlet;

import org.apache.wicket.request.UrlRenderer;
import org.apache.wicket.request.cycle.RequestCycle;
import org.apache.wicket.request.cycle.RequestCycleContext;

public class PortletRequestCycle extends RequestCycle
{

  public PortletRequestCycle(RequestCycleContext context)
  {
    super(context);
  }
  
  @Override
  protected UrlRenderer newUrlRenderer()
  {
    return new PortletUrlRenderer(getRequest());
  }

}
