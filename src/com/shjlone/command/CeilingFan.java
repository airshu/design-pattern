package com.shjlone.command;

/**
 * 吊扇
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 3;
    public static final int OFF = 3;
    String location;
    int speed;
    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        speed = HIGH;
        System.out.println(this.getClass().getName() + "high");
    }
    public void medium() {
        speed = MEDIUM;
        System.out.println(this.getClass().getName() + "medium");
    }
    public void low() {
        speed = LOW;
        System.out.println(this.getClass().getName() + "low");
    }
    public void off() {
        speed = OFF;
        System.out.println(this.getClass().getName() + "off");
    }
    public int getSpeed() {
        System.out.println(this.getClass().getName() + "getSpeed");
        return speed;
    }

}
