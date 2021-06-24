package com.shjlone.flyweight;

public class RedSprite extends AbsSprite {

    public RedSprite(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public void draw() {
        System.out.println("红色精灵");
    }
}
