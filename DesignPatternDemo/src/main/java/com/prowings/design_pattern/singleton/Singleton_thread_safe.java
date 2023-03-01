package com.prowings.design_pattern.singleton;

/**
 * @author Vaibhav
 *
 *
 *         Reflection can be used to destroy all the previous singleton
 *         implementation approaches. Here is an example class:
 * 
 * 
 *         When you run the preceding test class, you will notice that hashCode
 *         of both instances is not the same which destroys the singleton
 *         pattern. Reflection is very powerful and used in a lot of frameworks
 *         like Spring and Hibernate. Continue your learning with Java
 *         Reflection Tutorial.
 */
public class Singleton_thread_safe {

	private static Singleton_thread_safe obj;

	private Singleton_thread_safe() {
		super();
	}

	public static synchronized Singleton_thread_safe getInstance() {
		if (null == obj) {
			obj = new Singleton_thread_safe();
		}
		return obj;
	}

	public static void main(String[] args) {
		Singleton_thread_safe ob1 = Singleton_thread_safe.getInstance();
		Singleton_thread_safe ob2 = Singleton_thread_safe.getInstance();
		System.out.println(ob1 == ob2);
	}

}
