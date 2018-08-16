package com.infotel.builder;


/**
 * 
 */
public abstract  class Burger implements Item {

	public abstract float price();

	public Packaging packaging() {
		return new Wrapper(); // voir cLasse Abstraite instantiation
	}

}