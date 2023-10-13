package com.ixns.model.item;

public class VeggieBurger extends Burger {
    @Override
    public String name() {
        return "Veggie Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
