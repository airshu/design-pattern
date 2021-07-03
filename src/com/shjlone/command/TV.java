package com.shjlone.command;

public class TV {

    String name;
    public TV(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.getClass().getName() + " on ");
    }


    public void off() {
        System.out.println(this.getClass().getName() + " off ");
    }
    public void dim() {
        System.out.println(this.getClass().getName() + " dim");
    }


}
