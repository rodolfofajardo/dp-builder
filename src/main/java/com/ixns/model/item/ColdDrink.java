package com.ixns.model.item;

import com.ixns.model.packing.Bottle;
import com.ixns.model.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
