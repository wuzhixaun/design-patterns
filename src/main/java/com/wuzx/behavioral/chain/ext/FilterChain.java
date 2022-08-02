package com.wuzx.behavioral.chain.ext;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{

    // filte的链
    List<Filter> filterChain = new ArrayList<>();

    MyHello target = new MyHello();

    int cousor = 0;

    public void setTarget(MyHello target) {
        this.target = target;
    }

    public MyHello getTarget() {
        return target;
    }


    /**
     * t添加filter
     * @param filter
     */
    public void addFilter(Filter filter) {
        filterChain.add(filter);
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {


        if (cousor < this.filterChain.size()) {
            final Filter filter = this.filterChain.get(cousor);
            cousor++;
            filter.doFilter(request, response, filterChain);
        } else {
            target.hello();
            System.out.println(request.getMsg());
        }
    }
}
