package com.shjlone.chain_of_responsibility;

public class HttpReponse implements Response {
    public String result;

    @Override
    public String toString() {
        return "HttpReponse{" +
                "result='" + result + '\'' +
                '}';
    }
}
