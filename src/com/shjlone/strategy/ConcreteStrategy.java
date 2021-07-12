package com.shjlone.strategy;

public class ConcreteStrategy implements IStrategy {
    @Override
    public void execute() {
        System.out.println("执行策略 ");
    }
}
