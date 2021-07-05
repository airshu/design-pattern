package com.shjlone.observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreteObserver 收到信息，并进行处理。");
    }
}
