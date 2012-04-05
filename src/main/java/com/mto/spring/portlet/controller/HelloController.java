/*
 * Copyright (C) 2012 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package com.mto.spring.portlet.controller;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.Controller;
import java.util.HashMap;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date 4/4/12
 */
public class HelloController implements Controller
{

   @Override
   public void handleActionRequest(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception
   {

   }

   @Override
   public ModelAndView handleRenderRequest(RenderRequest renderRequest, RenderResponse renderResponse) throws Exception
   {
      ModelAndView modelAndView = new ModelAndView("helloworld", new HashMap<String, String>());
      modelAndView.addObject("hellomessage", "Hello World");

      return modelAndView;
   }
}
