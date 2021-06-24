package com.shjlone.builder;

import com.shjlone.builder.builders.CarBuilder;
import com.shjlone.builder.builders.CarManualBuilder;
import com.shjlone.builder.cars.Car;
import com.shjlone.builder.cars.Manual;
import com.shjlone.builder.director.Director;

public class BuilderPatternDemo {
    public static void main(String[] args) {

        //实例一
        //Builder 先设置外观
//        CarMaker carMaker = new CarMaker.Builder().setEngine("高级引擎").setTire("三星轮胎").setWindow("透明窗户").build();
//        //在进行生产
//        carMaker.make();


        //实例二
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());



    }
}





/**
 * 实际开发过程中，这种建造者模式的变形使用的更广泛
 */
class CarMaker {

    private Builder builder;
    public CarMaker(Builder builder) {
        this.builder = builder;
    }

    public void make() {
        System.out.println("拼装完成： " + builder.engineName + ", " + builder.tireName + ", " + builder.windowName);
    }

    public static class Builder {
        private String engineName;
        private String windowName;
        private String tireName;

        public Builder setEngine(String name) {
            engineName = name;
            System.out.println("准备引擎" + name);
            return this;
        }

        public Builder setTire(String name) {
            tireName = name;
            System.out.println("准备轮胎" + name);
            return this;
        }

        public Builder setWindow(String name) {
            windowName = name;
            System.out.println("准备车窗" + name);
            return this;
        }

        public CarMaker build() {
            CarMaker car = new CarMaker(this);
            return car;
        }

    }
}
