package com.shjlone.prototype;

/**
 * Java中原型模式的运用
 *
 * 1、具体类实现Cloneable接口
 * 2、实现clone方法，如果是直接调用super.clone，则为浅拷贝；需要深拷贝则需要clone中内部实现（序列化或者new）
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Airplane airplane = new Airplane();
        Engine engine = new Engine();
        engine.setName("引擎一号（Made In China）");
        airplane.setEngine(engine);
        System.out.println(airplane);
        Airplane copyAirplane = (Airplane) airplane.clone();
        System.out.println(copyAirplane);

    }
}

