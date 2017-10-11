package com.jt.core.services.impl;

import com.jt.core.services.AdminResourceResolver;
import com.jt.core.services.ConfigurableOsgiService;
import org.apache.sling.api.resource.ResourceResolver;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = AdminResourceResolver.class)
@Designate(ocd = ConfigurableOsgiService.class, factory = true)
public class AdminResourceResolverImpl implements AdminResourceResolver {
    

    protected static final Logger LOG = LoggerFactory.getLogger(AdminResourceResolverImpl.class);
    
    @Override
    public String getAdminResourceResolver() {
	ResourceResolver resourceResolver = null;
	/*try {
	    final Map<String, Object> authInfo = new HashMap<String, Object>();
	    authInfo.put(ResourceResolverFactory.SUBSERVICE, "adminResourceResolver");
	    resourceResolver = resolverFactory.getServiceResourceResolver(authInfo);
	} catch (final LoginException loginExcp) {
	    LOG.error("Exception while getting resource resolver." + loginExcp);
	}
*/
	return "TestString";
    }

    @Activate
    protected void activate(ConfigurableOsgiService configurableOsgiService){

    }
}
