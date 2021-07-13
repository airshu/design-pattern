package com.shjlone.template_method;

import java.util.HashMap;
import java.util.Map;

/**
 * 实现模版方法
 */
public class LocalSetting extends AbstractSetting {

    private Map<String, String> cache = new HashMap<>();

    protected String lookupCache(String key) {
        return cache.get(key);
    }

    protected void putIntoCache(String key, String value) {
        cache.put(key, value);
    }

}
