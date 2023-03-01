package com.prowings.design_pattern.singleton;

/**
 * @author Vaibhav
 * 
 *         Static block initialization implementation is similar to eager
 *         initialization, except that instance of the class is created in the
 *         static block that provides the option for exception handling.
 * 
 *         Both eager initialization and static block initialization create the
 *         instance even before it’s being used and that is not the best
 *         practice to use.
 *         
 *         drawback
 *         lack of lazy initializatiion
 *         it will create the object earlier
 *
 */
public class Singleton_staticblock_initilization {

	private static Singleton_staticblock_initilization obj;

	private Singleton_staticblock_initilization() {
		super();
	}

	static {
		try {
			obj = new Singleton_staticblock_initilization();
		} catch (Exception e) {
			throw new RuntimeException("exception occured in creating singleton..");
		}

	}

	public static Singleton_staticblock_initilization getInstance() {
		return obj;

	}

	public static void main(String[] args) {
		Singleton_staticblock_initilization obj1 = Singleton_staticblock_initilization.getInstance();
		System.out.println(obj == obj1);
	}

}
