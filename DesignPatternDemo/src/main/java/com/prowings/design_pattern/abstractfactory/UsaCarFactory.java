package com.prowings.design_pattern.abstractfactory;

public class UsaCarFactory {

	public static Car buildCar(CarType type)
	{
		Car car = null;
		
		switch(type)
		{
		case LUXURY:
			car = new LuxuryCar(Location.USA);
			break;
		case SEDAN:
			car = new SedanCar(Location.USA);
			break;
		case SMALL:
			car = new SmallCar(Location.USA);
			break;
		case SPORTS:
			car = new SportsCar(Location.USA);
			break;
		default:
			System.out.println("Invalid car type!!");
			break;
		}
		return car;
	}

}
