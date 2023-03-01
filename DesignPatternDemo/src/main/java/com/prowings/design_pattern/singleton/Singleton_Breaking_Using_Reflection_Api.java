package com.prowings.design_pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Vaibhav
 * 
 *         Reflection can be used to destroy all the previous singleton
 *         implementation approaches. Here is an example class:
 * 
 *         When you run the preceding test class, you will notice that hashCode
 *         of both instances is not the same which destroys the singleton
 *         pattern. Reflection is very powerful and used in a lot of frameworks
 *         like Spring and Hibernate. Continue your learning with Java
 *         Reflection Tutorial.
 *
 */
public class Singleton_Breaking_Using_Reflection_Api {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Singleton_Egar_Initialization ob1 = Singleton_Egar_Initialization.getInstance();
		Singleton_Egar_Initialization ob2 = null;

		Constructor[] constructors = ob1.getClass().getDeclaredConstructors();
		for (Constructor con : constructors) {
			con.setAccessible(true);
			ob2 = (Singleton_Egar_Initialization) con.newInstance();
		}

		System.out.println(ob1 == ob2);
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
	}

}
