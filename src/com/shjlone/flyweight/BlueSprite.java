package com.shjlone.flyweight;

public class BlueSprite extends AbsSprite {

    public BlueSprite(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public void draw() {
        System.out.println("蓝色精灵");
    }


}
