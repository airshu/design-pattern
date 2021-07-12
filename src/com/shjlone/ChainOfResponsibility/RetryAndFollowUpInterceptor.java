package com.shjlone.ChainOfResponsibility;

import java.io.IOException;

public class RetryAndFollowUpInterceptor extends BaseInterceptor {
    @Override
    public Response proceed(Request request) {
        System.out.println("RetryAndFollowUpInterceptor prceed");

        return super.proceed(request);
    }
}
