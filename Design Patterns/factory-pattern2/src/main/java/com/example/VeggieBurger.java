package com.example;

// CONCRETE PRODUCT
public class VeggieBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparing veggie burger");
    }

}
