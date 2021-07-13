package com.shjlone.mediator;

import java.util.Random;

/**
 * 销售部门
 */
public class SaleDepartment extends AbstractColleague {
    public SaleDepartment(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }
    //购买电脑
    public void sellIBMComputer(int number){
        //通知中介者销售产品
        super.abstractMediator.execute("sale.sell", number);
        System.out.println("销售了"+number+"台电脑。");
    }
    //获取销售状态
    public int getSaleStatus(){
        //随机生成一个数字，表示销售状态
        Random random = new Random();
        int saleStatus = random.nextInt(100);
        return saleStatus;
    }
    //打折销售
    public void offSale(){
        //通知中介者打折销售
        super.abstractMediator.execute("sale.offSale");
    }
}
