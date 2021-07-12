package com.shjlone.strategy;


public class Context {
    private IStrategy iStrategy;
    public void setStrategy(IStrategy strategy) {
        iStrategy = strategy;
    }

    public void execute() {
        iStrategy.execute();
    }
}
