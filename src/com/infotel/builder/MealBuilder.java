package com.infotel.builder;


/**
 * 
 */
public class MealBuilder extends Meal {
	
	private Meal meal = new Meal();

	public Meal prepareVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new VegBurger());
	      meal.addItem(new Coke());
	      return meal;
	   }   
	
	public Meal build(){
		return meal;
	}

}