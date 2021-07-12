package com.shjlone.ChainOfResponsibility;

/**
 * 责任链模式Demo
 *
 * 网络请求中，设置不同类型的拦截器，在请求前进行拦截，处理请求参数
 */
public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {

        Interceptor cacheInterceptor = new CacheInterceptor();
        Interceptor retryAndFollowUpInterceptor = new RetryAndFollowUpInterceptor();
        Interceptor callServerInterceptor = new CallServerInterceptor();

        cacheInterceptor.setNextInterceptor(retryAndFollowUpInterceptor);
        retryAndFollowUpInterceptor.setNextInterceptor(callServerInterceptor);
        HttpRequest request = new HttpRequest();
        request.url = "http://baidu.com";
        Response response = cacheInterceptor.proceed(request);
        System.out.println(response.toString());
    }
}
