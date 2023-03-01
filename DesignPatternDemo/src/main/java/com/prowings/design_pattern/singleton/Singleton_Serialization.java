package com.prowings.design_pattern.singleton;

import java.io.Serializable;

/**
 * @author Vaibhav
 * 
 *         Sometimes in distributed systems, we need to implement Serializable
 *         interface in the singleton class so that we can store its state in
 *         the file system and retrieve it at a later point in time. Here is a
 *         small singleton class that implements Serializable interface also:
 * 
 *         The problem with serialized singleton class is that whenever we
 *         deserialize it, it will create a new instance of the class. Here is
 *         an example:
 * 
 *         So it destroys the singleton pattern. To overcome this scenario, all
 *         we need to do is provide the implementation of readResolve() method.
 * 
 *         After this, you will notice that hashCode of both instances is the
 *         same in the test program.
 * 
 *         Read about Java Serialization and Java Deserialization.
 *
 */
public class Singleton_Serialization implements Serializable {

	private static final long serialVersionUID = -8725299128175795926L;

	private Singleton_Serialization() {
		super();

	}

	private static class SingletonHelper {

		private static final Singleton_Serialization instance1 = new Singleton_Serialization();

	}

	private static Singleton_Serialization getInstance() {

		return SingletonHelper.instance1;
	}

	public Object readResolve() {
		return Singleton_Serialization.getInstance();
	}

	public static void main(String[] args) {
		Singleton_Serialization instance2 = Singleton_Serialization.getInstance();
		Singleton_Serialization instance3 = Singleton_Serialization.getInstance();
		System.out.println(instance2 == instance3);

	}

}
