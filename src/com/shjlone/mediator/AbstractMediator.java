package com.shjlone.mediator;

public abstract class AbstractMediator {

    //库存部门
    protected StockDepartment stockDepartment = null;
    //销售部门
    protected SaleDepartment saleDepartment = null;
    //采购部门
    protected PurchaseDepartment purchaseDepartment = null;

    public AbstractMediator() {
        this.saleDepartment = new SaleDepartment(this);
        this.purchaseDepartment = new PurchaseDepartment(this);
        this.stockDepartment = new StockDepartment(this);
    }

    //定义一个中介者执行方法。共子类实现
    public abstract void execute(String type, Object... objects);
}
