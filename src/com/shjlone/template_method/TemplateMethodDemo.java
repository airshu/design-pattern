package com.shjlone.template_method;

/**
 * 模版方法模式
 */
public class TemplateMethodDemo {

    public static void main(String[] args) {
        AbstractSetting setting1 = new LocalSetting();
        System.out.println("test = " + setting1.getSetting("test"));
        System.out.println("test = " + setting1.getSetting("test"));
    }
}
