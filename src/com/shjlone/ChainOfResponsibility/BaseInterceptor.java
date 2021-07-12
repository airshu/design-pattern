package com.shjlone.ChainOfResponsibility;

import java.io.IOException;

public class BaseInterceptor implements Interceptor {

    Interceptor interceptor;


    @Override
    public void setNextInterceptor(Interceptor interceptor) {
        this.interceptor = interceptor;
    }

    @Override
    public Response proceed(Request request) {
        if(this.interceptor != null) {
            return this.interceptor.proceed(request);
        }
        return null;
    }
}
