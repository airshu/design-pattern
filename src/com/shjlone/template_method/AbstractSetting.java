package com.shjlone.template_method;

public abstract class AbstractSetting {

    private String readFromDatabase(String key) {
        // TODO: 从数据库读取
        return key;
    }

    public final String getSetting(String key) {
        // 先从缓存读取:
        String value = lookupCache(key);
        if (value == null) {
            // 在缓存中未找到,从数据库读取:
            value = readFromDatabase(key);
            System.out.println("[DEBUG] load from db: " + key + " = " + value);
            // 放入缓存:
            putIntoCache(key, value);
        } else {
            System.out.println("[DEBUG] load from cache: " + key + " = " + value);
        }
        return value;
    }

    /**
     * 模版方法，由子类实现
     * @param key
     * @return
     */
    protected abstract String lookupCache(String key);

    protected abstract void putIntoCache(String key, String value);

}
