package com.shjlone.prototype;

public class Engine {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}' + this.hashCode();
    }
}
