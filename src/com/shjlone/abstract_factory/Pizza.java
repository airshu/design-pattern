package com.shjlone.abstract_factory;

import java.util.ArrayList;

/**
 * 抽象产品
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing " +name);
        System.out.println("Tossing dough...");
        System.out.println("Add sauce...");
        System.out.println("Adding toppings: ");
        int size = toppings.size();
        for (int i=0; i< size; i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

}
