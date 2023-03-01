package com.prowings.design_pattern.singleton;

/**
 * @author Vaibhav
 * 
 *         1]=> drawback of the singleton egar initialization in this approach
 *         1)to creating the extra oobject/instantiation over head in memory.
 * 
 *         2)that approach we cann't handle the exception
 * 
 *         2]=>step for creating the singleton egar initialization
 * 
 *         1)create the object as class level
 * 
 *         2)creating the constructor as private declaration
 * 
 *         3)creating the static factory method
 * 
 *         4)creating the another object using getInstance method
 * 
 *         5)check the object to make the singleton or not
 */
public class Singleton_Egar_Initialization {

	private static Singleton_Egar_Initialization obj = new Singleton_Egar_Initialization();

	private Singleton_Egar_Initialization() {

	}

	public static Singleton_Egar_Initialization getInstance() {

		return obj;
	}

	public static void main(String[] args) {
		Singleton_Egar_Initialization obj2 = Singleton_Egar_Initialization.getInstance();
		System.out.println(obj == obj2);
	}

}
