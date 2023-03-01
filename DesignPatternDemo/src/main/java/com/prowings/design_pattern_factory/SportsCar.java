package com.prowings.design_pattern_factory;

public class SportsCar extends Car {

	public SportsCar(CarType type) {
		super(type);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("sports car constructing...");

	}

}
