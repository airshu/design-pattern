package com.shjlone.mediator;

/**
 * 中介者模式
 * <p>
 * 主要作用是将一对多关系变成一对一关系，降低耦合度
 */
public class MediatorDemo {
    public static void main(String[] args) {
//创建中介者
        AbstractMediator mediator = new ComMediator();
        //销售者进行销售,100台电脑
        SaleDepartment sale = new SaleDepartment(mediator);
        sale.sellIBMComputer(100);
        //获取库存状态
        StockDepartment stock = new StockDepartment(mediator);
        System.out.println("库存状态.." + stock.getStock());
        //采购者进行采购
        PurchaseDepartment purchase = new PurchaseDepartment(mediator);
        purchase.buyIBMComputer(1000);
        //获取库存状态
        System.out.println("库存状态.." + stock.getStock());
    }
}
