package com.prowings.design_pattern.abstractfactory;

public abstract class Car {
	private CarType type;
	private Location location;

	public Car(CarType type, Location location) {
		super();
		this.type = type;
		this.location = location;
		arrangeParts();
	}

	private void arrangeParts() {
		System.out.println("arrange parts!! for"+this.type+"location is:"+this.location);
		
	}
	protected abstract void construct(Location location);

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	

}
