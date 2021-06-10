package com.shjlone.designpattern.singleton;

/**
 * 双重锁校验
 */
public class DCLSingleton {

    private DCLSingleton() {
    }

    private volatile static DCLSingleton instance = null;

    public static DCLSingleton getInstance() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null)
                    instance = new DCLSingleton();
            }
        }
        return instance;
    }
}
