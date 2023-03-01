package com.prowings.design_pattern.singleton;

public class TestSingleton {
	public static void main(String[] args) {
		
		Singleton_Enum instance1=Singleton_Enum.INSTANCE;
		Singleton_Enum instance2=Singleton_Enum.INSTANCE;
		System.out.println(instance1==instance2);
	}

}
