package com.shjlone.abstract_factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizze(String type) {
        return new ChicagoStyleCheesePizza();
    }
}
