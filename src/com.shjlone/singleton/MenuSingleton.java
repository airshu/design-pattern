package com.shjlone.singleton;

/**
 * 枚举单例
 */
public class MenuSingleton {

    private MenuSingleton() {
    }

    public void whoAmI() {
        System.out.println(this.toString());
    }

    public static enum SingletonEnum {
        Instance;
        private MenuSingleton instance = null;

        private SingletonEnum() {
            instance = new MenuSingleton();
        }

        public MenuSingleton getInstance() {
            return instance;
        }
    }

    public static void main(String[] args) {
        SingletonEnum.Instance.getInstance().whoAmI();
    }

}
