package com.ixns.model.item;

import com.ixns.model.packing.Packing;

public interface Item {
    String name();
    Packing packing();
    float price();
}
