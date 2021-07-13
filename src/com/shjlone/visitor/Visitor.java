package com.shjlone.visitor;

/**
 * 定义了对每个 Element 访问的行为
 */
public interface Visitor {

    // 访问工程师类型
    void visit(Engineer engineer);

    // 访问经理类型
    void visit(Manager manager);
}
