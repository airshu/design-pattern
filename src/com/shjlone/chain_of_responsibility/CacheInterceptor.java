package com.shjlone.chain_of_responsibility;

public class CacheInterceptor extends BaseInterceptor {


    @Override
    public Response proceed(Request request){
        System.out.println("CacheInterceptor proceed");
        return super.proceed(request);
    }
}
