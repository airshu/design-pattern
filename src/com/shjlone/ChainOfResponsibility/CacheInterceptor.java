package com.shjlone.ChainOfResponsibility;

import java.io.IOException;

public class CacheInterceptor extends BaseInterceptor {


    @Override
    public Response proceed(Request request){
        System.out.println("CacheInterceptor proceed");
        return super.proceed(request);
    }
}
