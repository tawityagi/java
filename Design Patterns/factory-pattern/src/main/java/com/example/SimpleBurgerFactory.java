package com.example;

// FACTORY
public class SimpleBurgerFactory {
    // This class is still OPEN for modification
    // Violation of OPEN/CLOSED PRINCIPLE
    public Burger createBurger(String req) {
        Burger b = null;
        System.out.println(req + " Request received");
        if(req.equals("beef")) {
            b = new BeefBurger();
        } else if(req.equals("veggie")) {
            b = new VeggieBurger();
        } else {
            throw new IllegalArgumentException("Unknown burger type: " + req);
        }
        return b;
    }
}

/**
 * 
 * SOLUTION : BeefBurgerRestaurant and VeggieBurgerRestaurant (Concrete Creators)
 * extending Restaurant (Creator)
 * 
 * VeggieBurger and BeefBurger will be Concrete Products. 
 * This will be EXAMPLE 2
 */