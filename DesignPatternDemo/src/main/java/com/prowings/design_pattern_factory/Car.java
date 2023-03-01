package com.prowings.design_pattern_factory;

public abstract class Car {
	private CarType type;

	public Car(CarType type) {
		super();
		this.type = type;
		arrangeParts();

	}

	private void arrangeParts() {
		System.out.println("parts arrange for:  " + this.type);

	}

	protected abstract void construct();

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

}
