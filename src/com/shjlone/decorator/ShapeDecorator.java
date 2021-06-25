package com.shjlone.decorator;

/**
 * 形状的装饰器
 */
public class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }


    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
