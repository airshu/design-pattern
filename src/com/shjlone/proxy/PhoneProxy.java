package com.shjlone.proxy;

/**
 * 代理，调用真实对象的方法
 */
public class PhoneProxy implements PhoneFactory {

    private PhoneFactory phoneFactory;

    public PhoneProxy(PhoneFactory factory) {
        phoneFactory = factory;
    }

    @Override
    public void sell() {
        System.out.println("我是代理商，有人要买手机了");
        phoneFactory.sell();
        System.out.println("哈哈，又赚了一笔");
    }
}
