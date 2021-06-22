package com.shjlone.abstract_factory;

/**
 * 纽约披萨
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "THin Crust Dough";
        sauce = "Marinar Sauce";

        toppings.add("Grated Raggiano Cheese");
    }
}
