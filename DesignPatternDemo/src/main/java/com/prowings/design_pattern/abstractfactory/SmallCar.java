package com.prowings.design_pattern.abstractfactory;

public class SmallCar extends Car {

	public SmallCar(Location location) {
		super(CarType.SMALL, location);
		construct(location);
	}

	@Override
	protected void construct(Location location) {
		if (Location.ASIA == location)
			System.out.println("Small car constructed for ASIA location with Left Drive !!!");
		else if (Location.DEFAULT == location)
			System.out.println("Small car constructed for DEFAULT location with Central Drive!!!");
		else if (Location.USA == location)
			System.out.println("Small car constructed for USA location with Right Drive !!!");

	}

}
