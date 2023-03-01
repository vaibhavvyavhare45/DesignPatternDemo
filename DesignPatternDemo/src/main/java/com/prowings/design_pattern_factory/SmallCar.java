package com.prowings.design_pattern_factory;

public class SmallCar extends Car {

	public SmallCar(CarType type) {
		super(type);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("small car constructing...");

	}

}
