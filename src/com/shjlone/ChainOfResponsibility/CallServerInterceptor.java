package com.shjlone.ChainOfResponsibility;

public class CallServerInterceptor extends BaseInterceptor {

    @Override
    public Response proceed(Request request) {
        System.out.println("CallServerInterceptor prceed");
        HttpReponse response = new HttpReponse();
        response.result = ((HttpRequest)request).url + " 响应成功";
        return response;
    }
}
