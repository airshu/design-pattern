package com.shjlone.facade;

/**
 * 外观模式 示例
 *
 * 客户
 */
class Client {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new DvdPlayer(), new Screen());
        homeTheaterFacade.watchMovie("泰坦尼克号");
        homeTheaterFacade.endMovie();
    }

}