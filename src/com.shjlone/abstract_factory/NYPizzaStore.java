package com.shjlone.abstract_factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizze(String type) {
        return new NYStyleCheesePizza();
    }
}
