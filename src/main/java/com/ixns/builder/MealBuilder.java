package com.ixns.builder;

import com.ixns.model.Meal;
import com.ixns.model.item.ChickenBurger;
import com.ixns.model.item.Coke;
import com.ixns.model.item.Pepsi;
import com.ixns.model.item.VeggieBurger;

public class MealBuilder {
    public Meal prepareVeggieMeal() {
        Meal meal = new Meal();
        meal.addItem(new VeggieBurger());
        meal.addItem(new Coke());
        return meal;
    }
    public Meal prepareNonVeggieMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
