package com.prowings.design_pattern_factory;

public class LuxuryCar extends Car {

	public LuxuryCar(CarType type) {
		super(type);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("luxury car constructing...");
	}

}
