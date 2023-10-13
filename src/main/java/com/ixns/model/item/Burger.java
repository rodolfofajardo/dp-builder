package com.ixns.model.item;

import com.ixns.model.packing.Packing;
import com.ixns.model.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
