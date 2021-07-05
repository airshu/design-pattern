package com.shjlone.observer;

public interface Subject {
    /**
     * 注册一个观察者
     */
    public void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     */
    public void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    public void notifyObservers();
}
