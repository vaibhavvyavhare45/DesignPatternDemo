package com.prowings.design_pattern.singleton;

/**
 * @author Vaibhav
 * 
 *         A simple way to create a thread-safe singleton class is to make the
 *         global access method synchronized so that only one thread can execute
 *         this method at a time. Here is a general implementation of this
 *         approach:
 * 
 *         The preceding implementation works fine and provides thread-safety,
 *         but it reduces the performance because of the cost associated with
 *         the synchronized method, although we need it only for the first few
 *         threads that might create separate instances. To avoid this extra
 *         overhead every time, double-checked locking principle is used. In
 *         this approach, the synchronized block is used inside the if condition
 *         with an additional check to ensure that only one instance of a
 *         singleton class is created. The following code snippet provides the
 *         double-checked locking implementation:
 *
 */
public class Singleton_thread_safe_double_checked_null {

	private static Singleton_thread_safe_double_checked_null obj;

	private Singleton_thread_safe_double_checked_null() {
		super();
	}

	public static synchronized Singleton_thread_safe_double_checked_null getInstance() {
		if (obj == null) {// this is the double check mechanism
			synchronized (Singleton_thread_safe_double_checked_null.class) {// this is the synchronise block
				if (obj == null) {
					obj = new Singleton_thread_safe_double_checked_null();
				}

			}

		}
		return obj;
	}

	public static void main(String[] args) {
		Singleton_thread_safe_double_checked_null obj1 = Singleton_thread_safe_double_checked_null.getInstance();
		System.out.println(obj == obj1);
	}

}
