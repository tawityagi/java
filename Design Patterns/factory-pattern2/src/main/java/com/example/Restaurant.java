package com.example;

// CREATOR
public abstract class Restaurant {
    public Burger orderBurger() {
        Burger b = createBurger();
        b.prepare();
        return b;
    }

    public abstract Burger createBurger();

}
