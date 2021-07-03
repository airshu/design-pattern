package com.shjlone.command;

public class Stereo {
    String name;
    public Stereo(String name) {
        this.name = name;
    }
    public void on() {
        System.out.println("Stereo on");
    }
    public void off() {
        System.out.println("Stereo off");
    }

    public void setCd(){
        System.out.println("Stereo setCd");
    }

    public void setDvd() {
        System.out.println("Stereo setDvd");
    }

    public void setRadio() {
        System.out.println("Stereo setRadio");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo setVolume " + volume);
    }
}
