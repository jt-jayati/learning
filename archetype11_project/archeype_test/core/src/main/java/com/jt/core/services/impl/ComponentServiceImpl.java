package com.jt.core.services.impl;

import com.day.cq.wcm.api.Page;
import com.jt.core.services.ComponentService;
import org.apache.sling.api.resource.ResourceResolver;
import org.osgi.service.component.annotations.Component;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

@Component(service = ComponentService.class)
public class ComponentServiceImpl implements ComponentService {

	public String getComponent() {
		String path = "";
		/*try {
			path= node.getPath();
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return "CompoSrevice";
	}

	

}
