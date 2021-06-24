package com.shjlone.flyweight;

public class AbsSprite implements Sprite {

    private int x;
    private int y;

    private String color;

    public AbsSprite(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void draw() {

    }
}
