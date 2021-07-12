package com.shjlone.strategy;

/**
 * 策略模式Demo
 */
public class StrategyDemo {

    public static void main(String[] args) {
        ConcreteStrategy strategy = new ConcreteStrategy();
        Context context = new Context();
        context.setStrategy(strategy);
        context.execute();
    }
}
