package com.shjlone.chain_of_responsibility;

public class RetryAndFollowUpInterceptor extends BaseInterceptor {
    @Override
    public Response proceed(Request request) {
        System.out.println("RetryAndFollowUpInterceptor prceed");

        return super.proceed(request);
    }
}
