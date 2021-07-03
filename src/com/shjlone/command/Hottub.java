package com.shjlone.command;

public class Hottub {

    public void circulate() {
        System.out.println(this.getClass().getName() + "circulate");
    }
    public void jetsOn() {
        System.out.println(this.getClass().getName() + "jetsOn");
    }
    public void jetsOff() {
        System.out.println(this.getClass().getName() + "jetsOff");
    }
}
