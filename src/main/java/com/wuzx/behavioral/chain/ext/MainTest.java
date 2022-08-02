package com.wuzx.behavioral.chain.ext;

public class MainTest {
    public static void main(String[] args) {


        FilterChain filterChain = new FilterChain();

        Filter filter = new HttpFilter();
        Filter filter2 = new EncodingFilter();
        Filter filter3 = new CharacterFilter();

        filterChain.addFilter(filter);
        filterChain.addFilter(filter2);
        filterChain.addFilter(filter3);

        // filter 如何链式执行

        filterChain.doFilter(new Request("request"), new Response("responese"), filterChain);

    }
}
