package com.aathif.chatterbox.api;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.aathif.chatterbox.services.UserService;

public class Api implements BundleActivator {

	private ServiceReference<UserService> userService;

	public void start(BundleContext context) throws Exception {
		System.out.println("Started chatterbox-api");
		userService = context.getServiceReference(UserService.class);
		UserAPI userAPI = new UserAPI(context.getService(userService));
		userAPI.getAllUsers();
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopped chatterbox-api");
	}

}
