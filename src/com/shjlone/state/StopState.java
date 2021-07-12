package com.shjlone.state;

public class StopState extends State{
    @Override
    void handle() {
        System.out.println("结束状态");
    }
}
