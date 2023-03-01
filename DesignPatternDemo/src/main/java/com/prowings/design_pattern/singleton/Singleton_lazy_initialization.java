package com.prowings.design_pattern.singleton;

/**
 * @author Vaibhav
 * 
 *         Lazy initialization method to implement the singleton pattern creates
 *         the instance in the global access method. Here is the sample code for
 *         creating the singleton class with this approach:
 * 
 *         The preceding implementation works fine in the case of the
 *         single-threaded environment, but when it comes to multi-threaded
 *         systems, it can cause issues if multiple threads are inside the if
 *         condition at the same time. It will destroy the singleton pattern and
 *         both threads will get different instances of the singleton class. In
 *         the next section, we will see different ways to create a thread-safe
 *         singleton class.
 */
public class Singleton_lazy_initialization {

	private static Singleton_lazy_initialization obj;

	private Singleton_lazy_initialization() {
		super();
	}

	public static Singleton_lazy_initialization getInstance() {
		if (obj == null) {
			obj = new Singleton_lazy_initialization();
		}
		return obj;
	}

	public static void main(String[] args) {
		Singleton_lazy_initialization obj2 = Singleton_lazy_initialization.getInstance();

		System.out.println(obj==obj2);
	}
}
