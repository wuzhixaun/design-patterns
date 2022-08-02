package com.wuzx.behavioral.chain.ext;

public class HttpFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        // requesst

        request.msg += ">>>>";
        // 放下
        System.out.println("HttpFilter doFilter之前 ");
        filterChain.doFilter(request, response, filterChain);
        System.out.println("HttpFilter  doFilter之后 ");


    }
}
