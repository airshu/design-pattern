package com.shjlone.ChainOfResponsibility;

import java.io.IOException;

/**
 * 所有拦截器的抽象接口
 */
public interface Interceptor {

    void setNextInterceptor(Interceptor interceptor);

    Response proceed(Request request);
}
