package com.infotel.builder;


/**
 * 
 */
public abstract class Game implements Item{

	public Packaging packaging() {
		return new Emballage();
	}

	public abstract float price();

}