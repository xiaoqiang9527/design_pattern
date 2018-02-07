package com.hqjl.design.pattern.FactoryMethod;

/**
 * @Description: 工厂模式——黄种人
 * @Author qin
 * @Date 2018/2/6
 */
public class YellowHuman implements Human{

    @Override
    public void laugh() {
        System.out.println("黄种人会大笑，哈哈哈哈");

    }

    @Override
    public void cry() {
        System.out.println("黄种人会哭，呜呜呜呜");
    }

    @Override
    public void talk() {
        System.out.println("黄种人会说，叨叨叨叨");
    }

    @Override
    public void happy() {
        System.out.println("黄种人会开心，嘻嘻嘻嘻");
    }

    @Override
    public void hope() {
        System.out.println("Don't Look Back，hang on......");
    }
}
