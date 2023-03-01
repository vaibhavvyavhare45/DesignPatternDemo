package com.prowings.design_pattern_factory;

public class SedanCar extends Car {

	public SedanCar(CarType type) {
		super(type);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("sedan car constructing...");

	}

}
