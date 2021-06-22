package com.shjlone.facade;

public class DvdPlayer {
    public void on() {
        System.out.println("打开DVD播放器");
    }

    public void play(String movie) {
        System.out.println("打开电影" + movie);
    }

    public void stop() {
        System.out.println("关闭电影咯");
    }

    public void off() {
        System.out.println("关闭DVD播放器");
    }
}
