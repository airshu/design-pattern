package com.shjlone.command;

/**
 * 车库门
 */
public class GarageDoor {
    String name;
    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(this.getClass().getName() + "up");
    }
    public void down() {
        System.out.println(this.getClass().getName() + "down");
    }
    public void stop() {
        System.out.println(this.getClass().getName() + "stop");
    }
    public void lightOn() {
        System.out.println(this.getClass().getName() + "lightOn");
    }
    public void lightOff() {
        System.out.println(this.getClass().getName() + "lightOff");
    }
}
