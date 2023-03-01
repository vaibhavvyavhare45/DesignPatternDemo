package com.prowings.design_pattern.abstractfactory;

public class CarFactory {
	public static Car buildCar(CarType type,Location location) {
		Car car=null;
		switch(location) {
		case ASIA:
			car=AsiaCarFactory.buildCar(type);
			break;
		
		case USA:
			car=UsaCarFactory.buildCar(type);
			break;
			
		case DEFAULT:
			car=DefaultCarFactory.buildCar(type);
			break;
			
			default:
				System.out.println("we only support Default,Asia and USA location!");
		 
		}
		return car;
	}
	

}
