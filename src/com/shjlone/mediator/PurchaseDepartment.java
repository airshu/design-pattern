package com.shjlone.mediator;

/**
 * 采购部门
 */
public class PurchaseDepartment extends AbstractColleague {

    public PurchaseDepartment(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    //购买电脑。属于同事类的自身方法。无需借助Mediator。
    public void buyIBMComputer(int number) {
        //通知中介者，购买number台电脑。
        super.abstractMediator.execute("purchase.buy" , number);
    }

    //拒绝购买电脑
    public void refuseBuyIBM() {
        System.out.println("拒绝购买电脑...");
    }
}
