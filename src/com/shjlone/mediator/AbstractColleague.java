package com.shjlone.mediator;

public abstract class AbstractColleague {
    //抽象的同事类，使得通过构造函数将中介者实例化
    protected AbstractMediator abstractMediator;
    public AbstractColleague(AbstractMediator abstractMediator){
        this.abstractMediator = abstractMediator;
    }
}
