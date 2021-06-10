package com.shjlone.designpattern.adapter.objectadapter;

/**
 * 对象适配器模式
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        TypeC typeC = new Phone();
        MicroUsb microUsb = new Adapter(typeC);
        microUsb.microUsb();
    }
}

//  供应接口
interface MicroUsb {
    public void microUsb();
}

//  需求接口
interface TypeC {
    public void typeC();
}

//  需求实现类
class Phone implements TypeC {
    public void typeC() {
        System.out.println("Type-C接口");
    }
}

//  适配器
class Adapter implements MicroUsb {
    private TypeC typeC;

    public Adapter(TypeC typeC) {
        this.typeC = typeC;
    }

    @Override
    public void microUsb() {
        typeC.typeC();
    }
}
