package com.aathif.chatterbox.api;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.aathif.chatterbox.services.UserServiceImpl;

public class Api implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		System.out.println("Started chatterbox-api");
		UserAPI userAPI = new UserAPI(new UserServiceImpl());
		userAPI.getAllUsers();
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopped chatterbox-api");
	}

}
