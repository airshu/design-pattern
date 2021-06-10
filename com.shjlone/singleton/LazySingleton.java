package com.shjlone.singleton;

/**
 * 懒汉式
 */
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton (){}
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
