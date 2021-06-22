package com.shjlone.adapter.defaultadapter;

/**
 * 默认适配器，用于隐藏一些实现细节
 */
public class DefaultAdapterTest {
    public static void main(String[] args) {
        TypecToVGA typecToVGA = new TypecToVGA();
        typecToVGA.isTypeC();
        typecToVGA.isVGA();
    }
}

//  接口类
interface AllPorts {
    public void isTypeC();

    public void isVGA();

    public void isHdmi();
}

//  适配器的框架
abstract class Adapter implements AllPorts {
    @Override
    public void isTypeC() {
    }

    @Override
    public void isVGA() {
    }

    @Override
    public void isHdmi() {
    }
}

//  适配器类
class TypecToVGA extends Adapter {
    @Override
    public void isTypeC() {
        System.out.println("信号从TypeC接口进入");
    }

    @Override
    public void isVGA() {
        System.out.println("信号从VGA接口出");
    }
}
