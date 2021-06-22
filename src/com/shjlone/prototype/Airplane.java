package com.shjlone.prototype;

/**
 * 飞机
 */
public class Airplane implements Cloneable {
//     飞机的名字，内部产生
    private String name = "阿波罗：" + Math.round(Math.random()*10000);
    // 飞机的引擎
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * 克隆一台真正可以飞的飞机
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {

//浅拷贝实现
//        try {
//            return super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return null;

//深拷贝实现
        Airplane airplane = new Airplane();
        airplane.name = name;
        Engine engine = new Engine();
        engine.setName(this.engine.getName());
        airplane.engine = engine;
        return airplane;
    }


    @Override
    public String toString() {
        return "Airplane{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}' + this.hashCode();
    }

}
