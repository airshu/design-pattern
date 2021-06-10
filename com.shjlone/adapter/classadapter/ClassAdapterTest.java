package com.shjlone.designpattern.adapter.classadapter;

/**
 * 类适配器
 */
public class ClassAdapterTest {

    public static void main(String[] args) {
        MicroUsb microUsb = new Adapter();
        microUsb.microUsb();
    }
}

//供应接口
interface MicroUsb {
    public void microUsb();
}

//需求接口
interface TypeC {
    public void typeC();
}

//需求实现类
class Phone implements TypeC {
    public void typeC() {
        System.out.println("Type-C接口");
    }
}

//适配器
class Adapter extends Phone implements MicroUsb {
    public void microUsb() {
        typeC();
    }
}