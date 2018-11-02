package com.aathif.chatterbox;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class App implements BundleActivator {

	public void start(BundleContext arg0) throws Exception {
		System.out.println("App Started Successfully");
	}

	public void stop(BundleContext arg0) throws Exception {
		System.out.println("App Stopped Succesfully");
	}

}
