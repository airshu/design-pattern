package com.shjlone.facade;

/**
 * 家庭影院外观
 *
 * 封装子系统
 */
public class HomeTheaterFacade {
    DvdPlayer dvdPlayer;
    Screen screen;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.screen = screen;
    }

    /**
     * 看电影咯
     * @param movie
     */
    public void watchMovie(String movie) {
        System.out.println("开始看电影...");
        this.screen.down();
        this.dvdPlayer.on();
        this.dvdPlayer.play(movie);
    }

    /**
     * 不看了
     */
    public void endMovie() {
        System.out.println("开始关闭电影...");
        this.screen.up();
        this.dvdPlayer.stop();
        this.dvdPlayer.off();
    }
}
