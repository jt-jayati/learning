package com.jt.core.services;

import org.apache.sling.api.resource.ResourceResolver;

public interface AdminResourceResolver {
    /**
     * Returns ResourceResolver with 'admin' rights.
     *
     * @return {@link ResourceResolver}
     */
    public String getAdminResourceResolver();
}
