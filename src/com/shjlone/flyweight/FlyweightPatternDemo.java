package com.shjlone.flyweight;

/**
 * 享元模式Demo
 *
 * 精髓在于对象的复用，减少性能消耗
 */
public class FlyweightPatternDemo {

    public static void main(String[] args) {
        String color;
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                color = "red";
            } else {
                color = "blue";
            }
            SpriteFactory.getSprite(random(0, 50), random(0, 50), color);
        }

    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
