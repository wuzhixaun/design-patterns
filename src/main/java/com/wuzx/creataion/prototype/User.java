package com.wuzx.creataion.prototype;


import lombok.Data;
import lombok.val;

/**
 * 原型模式。用于创建重复的对象，本体给外部提供一个克隆体进行使用
 */
@Data
public class User implements Cloneable {


    private String userName;
    private Integer age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        final val user = new User();
        user.setUserName(this.userName);
        user.setAge(this.age);
        return user;
    }
}
