package com.shjlone.ChainOfResponsibility;

public class HttpReponse implements Response {
    public String result;

    @Override
    public String toString() {
        return "HttpReponse{" +
                "result='" + result + '\'' +
                '}';
    }
}
