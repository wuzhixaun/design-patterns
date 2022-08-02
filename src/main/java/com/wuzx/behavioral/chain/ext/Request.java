package com.wuzx.behavioral.chain.ext;

import lombok.Data;

@Data
public class Request {
    String msg;

    public Request(String msg) {
        this.msg = msg;
    }
}
