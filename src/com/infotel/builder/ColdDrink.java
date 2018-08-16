package com.infotel.builder;

public abstract class ColdDrink implements Item {

	public Packaging packaging() {
		return new Bottle();
	}

	public abstract float price();

}