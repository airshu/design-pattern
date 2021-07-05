package com.shjlone.observer;

/**
 * 观察者模式Demo
 */
public class ObserverDemo {

    public static void main(String[] args) {
        Subject sub = new ConcreteSubject();
        sub.registerObserver(new ConcreteObserver()); //添加观察者1
        sub.notifyObservers();
    }

}




