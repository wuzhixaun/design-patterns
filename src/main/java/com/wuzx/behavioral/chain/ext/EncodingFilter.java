package com.wuzx.behavioral.chain.ext;

public class EncodingFilter implements Filter {


    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {

        request.msg += "===";
        System.out.println("EncodingFilter doFilter之前 ");
        filterChain.doFilter(request, response, filterChain);
        System.out.println("EncodingFilter  doFilter之后 ");

    }
}
