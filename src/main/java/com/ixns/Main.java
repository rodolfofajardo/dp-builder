package com.ixns;

import com.ixns.builder.MealBuilder;
import com.ixns.model.Meal;

public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal veggieMeal = mealBuilder.prepareVeggieMeal();
        System.out.println("======== Veggie Meal ========");
        veggieMeal.showItems();
        System.out.println("Total Cost: $" + veggieMeal.getCost());

        System.out.println("\n\n");

        Meal nonVeggieMeal = mealBuilder.prepareNonVeggieMeal();
        System.out.println("====== Non Veggie Meal ======");
        nonVeggieMeal.showItems();
        System.out.println("Total Cost: $" + nonVeggieMeal.getCost());
    }
}