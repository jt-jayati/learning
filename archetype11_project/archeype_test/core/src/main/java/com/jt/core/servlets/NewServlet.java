/*
 *  Copyright 2015 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.jt.core.servlets;

import com.jt.core.services.AdminResourceResolver;
import com.jt.core.services.ComponentService;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

/**
 * Servlet that writes some sample content into the response. It is mounted for
 * all resources of a specific Sling resource type. The
 * {@link SlingSafeMethodsServlet} shall be used for HTTP methods that are
 * idempotent. For write operations use the {@link SlingAllMethodsServlet}.
 */
@Component(service=Servlet.class, immediate = true,
           property={
                   Constants.SERVICE_DESCRIPTION + "=Simple Demo Servlet",
                    "sling.servlet.paths="+"/bin/arechtype11/test",
                   "sling.servlet.methods=" + HttpConstants.METHOD_GET,
                   "sling.servlet.extensions=" + "txt"
           })
public class NewServlet extends SlingSafeMethodsServlet {

    private static final long serialVersionUid = 1L;

    @Reference
    AdminResourceResolver arr;

    ComponentService componentService;

    @Reference
    public void bindComponentService(ComponentService componentService){
        // bind or set or add
        this.componentService = componentService;
    }

    //unbind or unset or remove respectively
    public void unbindComponentService(ComponentService componentService){
        this.componentService = null;
    }

    @Override
    protected void doGet(final SlingHttpServletRequest req,
            final SlingHttpServletResponse resp) throws ServletException, IOException {

        final Resource resource = req.getResource();
        resp.setContentType("text/plain");
        resp.getWriter().write("Title = Trial"+arr.getAdminResourceResolver() + "   Second Service = "+ componentService.getComponent());
    }
}
