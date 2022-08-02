package com.wuzx.creataion.builder;

public class XiaomiBuilder extends AbstractBuilder {

    public XiaomiBuilder() {
        phone = new Phone();
    }


    @Override
    AbstractBuilder cpu(String cpu) {
        phone.cpu = cpu;
        return this;
    }

    @Override
    AbstractBuilder mem(String mem) {
        phone.mem = mem;
        return this;
    }

    @Override
    AbstractBuilder disk(String disk) {
        phone.disk = disk;
        return this;
    }

    @Override
    AbstractBuilder cam(String cam) {
        phone.cam = cam;
        return this;
    }
}
