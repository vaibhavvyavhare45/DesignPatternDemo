package com.prowings.design_pattern_factory;

public class TestCarFactory {
	public static void main(String[] args) {
		Car lc = CarFactory.buildCar(CarType.LUXURY);
//		Car sc = CarFactory.buildCar(CarType.SEDAN);
//		Car sm = CarFactory.buildCar(CarType.SMALL);
//		Car spc = CarFactory.buildCar(CarType.SPORTS);
	}

}
