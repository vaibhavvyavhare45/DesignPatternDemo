package com.prowings.design_pattern.singleton;

/**
 * @author Vaibhav
 * 
 *         Prior to Java 5, the Java memory model had a lot of issues, and the
 *         previous approaches used to fail in certain scenarios where too many
 *         threads tried to get the instance of the singleton class
 *         simultaneously. So Bill Pugh came up with a different approach to
 *         create the singleton class using an inner static helper class. Here
 *         is an example of the Bill Pugh Singleton implementation:
 * 
 *         Notice the private inner static class that contains the instance of
 *         the singleton class. When the singleton class is loaded,
 *         SingletonHelper class is not loaded into memory and only when someone
 *         calls the getInstance() method, this class gets loaded and creates
 *         the singleton class instance. This is the most widely used approach
 *         for the singleton class as it doesn’t require synchronization.
 *
 */
public class Singleton_Bill_Pugh {

	private Singleton_Bill_Pugh() {
		super();
	}

	private static class SingletonHelper {
		private static final Singleton_Bill_Pugh obj = new Singleton_Bill_Pugh();

	}

	public static Singleton_Bill_Pugh getInstance() {
		return SingletonHelper.obj;
	}

	public static void main(String[] args) {
		Singleton_Bill_Pugh obj1 = Singleton_Bill_Pugh.getInstance();
		Singleton_Bill_Pugh obj2 = Singleton_Bill_Pugh.getInstance();
		System.out.println(obj1 == obj2);
	}

}
