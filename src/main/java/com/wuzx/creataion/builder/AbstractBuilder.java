package com.wuzx.creataion.builder;

public abstract class AbstractBuilder {
    Phone phone;

    abstract AbstractBuilder cpu(String cpu);

    abstract AbstractBuilder mem(String mem);

    abstract AbstractBuilder disk(String mem);

    abstract AbstractBuilder cam(String mem);

    Phone getPhone() {
        return phone;
    }
}
