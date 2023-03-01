package com.prowings.design_pattern;

/**
 * @author Vaibhav how to create singleton object creation 1]=> to declare the
 *         object field is private static means private static Singleton
 *         obj=null;
 * 
 *         2]=>to declare the constructor as private The constructor of a
 *         singleton class is declared as private for the following reasons:
 * 
 *         To prevent external instantiation: By declaring the constructor as
 *         private, it becomes inaccessible from outside the class, preventing
 *         external instantiation of the class.
 * 
 *         To ensure the single instance: Since the constructor is private, the
 *         only way to get an instance of the singleton class is through the
 *         getInstance method, which returns the single instance of the class.
 * 
 *         To maintain the consistency of the singleton pattern: Declaring the
 *         constructor as private helps maintain the consistency of the
 *         singleton pattern. It ensures that the singleton class can only be
 *         instantiated once, making it easier to understand and maintain the
 *         pattern.
 * 
 *         By declaring the constructor as private, the singleton pattern can be
 *         ensured and the single instance of the class can be controlled and
 *         managed throughout the application.
 * 
 *         3]=> to creating the public static factory method and that method in
 *         checking the null check operartion in method
 * 
 *         4]=> to check the object is null or not , creating the object of
 *         singleton class is {getInstance()} method, then chekinng the object
 *         is singleton or not using {==} operator
 * 
 * 
 *
 *
 *
 *
 */
class Singleton {

	private static Singleton obj = null;

	private Singleton() {
		super();
	}

	public static Singleton getInstance() {
		if (obj == null) {
			obj = new Singleton();
		}
		return obj;
	}

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1 == obj2);// that means the creating object is singlton
	}
}