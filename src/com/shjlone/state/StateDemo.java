package com.shjlone.state;

/**
 * 状态模式Demo
 */
public class StateDemo {
    public static void main(String[] args) {
        StartState startState = new StartState();
        StopState stopState = new StopState();

        Context context = new Context();
        context.setState(startState);
        context.doAction();

        context.setState(stopState);
        context.doAction();
    }
}
