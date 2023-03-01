package com.prowings.design_pattern.abstractfactory;

public class SedanCar extends Car {

	

	public SedanCar(Location location) {
		super(CarType.SEDAN, location);
		construct(location);
	}

	@Override
	protected void construct(Location location) {
		if(Location.ASIA == location)
			System.out.println("Sedan car constructed for ASIA location with Left Drive !!!");
			else if(Location.DEFAULT == location)
				System.out.println("Sedan car constructed for DEFAULT location with Central Drive!!!");
			else if(Location.USA == location)
				System.out.println("Sedan car constructed for USA location with Right Drive !!!");

	}

}
