package com.shjlone.mediator;

/**
 * 中介者，一对多关系的处理
 */
public class ComMediator extends AbstractMediator {
    @Override
    public void execute(String type, Object... objects) {
        //采购电脑，销售电脑，折价销售电脑，清仓处理
        if(type.equalsIgnoreCase("purchase.buy")){
            this.buyIBMComputer((Integer)objects[0]);
        }else if(type.equalsIgnoreCase("sale.sell")){
            saleComputer((Integer)objects[0]);
        }else if(type.equalsIgnoreCase("sale.offSale")){
            offSell();
        }else if(type.equalsIgnoreCase("stock.clear")){
            clearStock();
        }
    }

    //清空仓库
    private void clearStock(){
        //清空仓库中的所有电脑。
        super.stockDepartment.clearStock();
    }
    //购买电脑
    private void buyIBMComputer(int number){
        //首先获取销售类，如果销售状态>80，就可以进行采购
        int saleStatus = super.saleDepartment.getSaleStatus();
        if(saleStatus > 80){
            super.purchaseDepartment.buyIBMComputer(number);
            //购买完成后，库存增加一定的电脑
            super.stockDepartment.increase(number);
        }else{
            //效益不好，折半采购
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑："+buyNumber+"台.");
            super.stockDepartment.increase(buyNumber);
        }

    }
    //销售电脑
    private void saleComputer(int number){
        //检查库存量
        if(super.stockDepartment.getStock()<number){
            //库存量不足，通知采购电脑
            super.purchaseDepartment.buyIBMComputer(number);
        }
        //将库存减去相应的电脑数
        super.stockDepartment.decrease(number);
    }
    //折半销售电脑
    private void offSell(){
        System.out.println("折半销售电脑："+super.stockDepartment.getStock()+"台");
    }
}
