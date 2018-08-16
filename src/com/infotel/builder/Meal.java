package com.infotel.builder;
import java.util.*;


public class Meal {
	private List<Item> items = new ArrayList<Item>();

	public Meal addItem(Item item) {
		items.add(item);
		return this;
	}
	public Meal addItem(Item item, int numMeal) {
		for (int i = 0; i < numMeal; i++) {
			items.add(item);
		}

		return this;
	}

	/**
	 * @return
	 */
	public float getCost() {
		// TODO implement here
		return 0.0f;
	}

	/**
     * @return
     */
    public void showItems() {
        // TODO implement here
        return;
    }

   

}