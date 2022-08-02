package com.wuzx.behavioral.chain.ext;

public class CharacterFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {

        request.msg += "-----";

        System.out.println("CharacterFilter doFilter之前 ");
        filterChain.doFilter(request, response, filterChain);
        System.out.println("CharacterFilter  doFilter之后 ");


    }
}
