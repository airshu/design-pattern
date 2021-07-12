package com.shjlone.state;

public class Context {
    State state;
    public void setState(State state) {
        this.state = state;
    }

    public void doAction() {
        this.state.handle();
    }
}
