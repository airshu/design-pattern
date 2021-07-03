package com.shjlone.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 使用AtomicReference的单例
 */
public class AtomicReferenceSingleton {

    private static final AtomicReference<Object> instance;

    private AtomicReferenceSingleton() {
    }


    static {
        instance = new AtomicReference<>();
    }

    public static AtomicReferenceSingleton getInstance() {
        Object value = AtomicReferenceSingleton.instance.get();
        if (value == null) {
            synchronized (AtomicReferenceSingleton.instance) {
                value = AtomicReferenceSingleton.instance.get();
                if (value == null) {
                    final AtomicReferenceSingleton actualValue = new AtomicReferenceSingleton();
                    value = ((actualValue == null)) ? AtomicReferenceSingleton.instance : actualValue;
                    AtomicReferenceSingleton.instance.set(value);
                }
            }
        }
        return (AtomicReferenceSingleton)((value == AtomicReferenceSingleton.instance) ? null : value);
    }


    public static void main(String[] args) {
        System.out.println(AtomicReferenceSingleton.getInstance());
        System.out.println(AtomicReferenceSingleton.getInstance());
        System.out.println(AtomicReferenceSingleton.getInstance());

        for(int i=0; i<10; i++) {
            new Thread() {
                @Override
                public void run() {
                    super.run();
                    System.out.println(AtomicReferenceSingleton.getInstance());
                }
            }.start();
        }

    }
}
