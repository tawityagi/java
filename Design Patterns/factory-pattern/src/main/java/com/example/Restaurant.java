package com.example;

// CLIENT
public class Restaurant {
    public Burger orderBurger(String req){
        SimpleBurgerFactory f = new SimpleBurgerFactory();
        Burger b = f.createBurger(req);
        b.prepare();
        return b;
    }
}
