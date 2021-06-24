package com.shjlone.flyweight;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class SpriteFactory {

    /**
     * 复用池
     */
    private static final HashMap<String, Sprite> spriteMap = new HashMap<String, Sprite>();

    private static AtomicInteger count = new AtomicInteger(); //用于统计精灵个数

    public static Sprite getSprite(int x, int y, String color) {
        String key = color + "x=" + x + "y=" + y;
        Sprite sprite = (Sprite) spriteMap.get(key);

        if (sprite == null) {
            switch (color) {
                case "red":
                    sprite = new RedSprite(x, y, color);
                    break;
                case "blue":
                    sprite = new BlueSprite(x, y, color);
            }
            spriteMap.put(key, sprite);
            System.out.println("Creating sprite of color : " + color + "x=" + x + ",y=" + y + "   count: " + count.addAndGet(1));

        }
        return sprite;
    }
}
