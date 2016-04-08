package org.example.domainmodel.scoping;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;


import com.google.inject.Inject;
import com.google.inject.name.Named;

public class ScopingTest extends DomainmodelScopeProvider{
	@Inject
	@Named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)
	private IScopeProvider delegate;
	
	
	@Inject
	IContainer.Manager manager;
	
	public void listVisibleResources(Resource myResource,
			IResourceDescriptions index) {
		IResourceDescription descr = index.getResourceDescription(myResource
				.getURI());
		for (IContainer visibleContainer : manager.getVisibleContainers(descr,	index)) {
			for (IResourceDescription visibleResourceDesc : visibleContainer.getResourceDescriptions()) {
				System.out.println(visibleResourceDesc.getURI());
			}
		}
	}

}
