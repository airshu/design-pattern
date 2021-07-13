package com.shjlone.mediator;

/**
 * 库存部门
 */
public class StockDepartment extends AbstractColleague {
    //库存默认有10台电脑。
    private static int 	COMPUTER_NUMBER = 100;
    public StockDepartment(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }
    //增加库存
    public void increase(int number){
        COMPUTER_NUMBER += number;
    }
    //获得库存量
    public int getStock(){
        return COMPUTER_NUMBER;
    }
    //减少库存
    public void decrease(int number){
        COMPUTER_NUMBER -= number;
    }
    //清空库存
    public void clearStock(){
        System.out.println("清空了仓库里的"+COMPUTER_NUMBER+"台电脑...");
        COMPUTER_NUMBER = 0;
    }
}
