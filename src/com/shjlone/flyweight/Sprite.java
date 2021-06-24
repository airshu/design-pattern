package com.shjlone.flyweight;

/**
 * 精灵接口
 */
public interface Sprite {

    void setX(int x);

    /**
     * 返回精灵的x坐标
     * @return
     */
    int getX();

    void setY(int y);

    /**
     * 返回精灵的y坐标
     * @return
     */
    int getY();

    //绘制
    void draw();
}
