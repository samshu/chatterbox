package com.aathif.chatterbox;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.aathif.chatterbox.services.UserService;
import com.aathif.chatterbox.services.UserServiceImpl;

public class App implements BundleActivator {

	private ServiceRegistration userService;
	
	public void start(BundleContext bundleCtx) throws Exception {
		System.out.println("Starting chatterbox-services...");
		userService = bundleCtx.registerService(UserService.class.getName(), new UserServiceImpl(), null);
		System.out.println("chatterbox-services Started Successfully");
	}

	public void stop(BundleContext bundleCtx) throws Exception {
		System.out.println("Stopping chatterbox-services...");
		userService.unregister();
		System.out.println("chatterbox-services Stopped Succesfully");
	}

}
