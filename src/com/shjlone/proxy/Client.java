package com.shjlone.proxy;

public class Client {

    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        PhoneProxy proxy = new PhoneProxy(appleFactory);

        proxy.sell();

    }
}
