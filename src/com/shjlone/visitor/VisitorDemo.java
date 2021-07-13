package com.shjlone.visitor;

/**
 * 访问者模式
 *
 * 公司报表，CEO查看产品数量，CTO查看代码行数
 *
 */
public class VisitorDemo {

    public static void main(String[] args) {
        // 构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO看报表 ===========");
        report.showReport(new CEOVisitor());
        System.out.println("=========== CTO看报表 ===========");
        report.showReport(new CTOVisitor());

    }

}
