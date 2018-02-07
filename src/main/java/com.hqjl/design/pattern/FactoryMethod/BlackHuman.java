package com.hqjl.design.pattern.FactoryMethod;

/**
 * @Description: 工厂模式——黑人
 * @Author qin
 * @Date 2018/2/6
 */
public class BlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑人会大笑");
    }

    @Override
    public void cry() {
        System.out.println("黑人会哭");

    }

    @Override
    public void talk() {
        System.out.println("黑人会说");

    }

    @Override
    public void happy() {
        System.out.println("黑人会happy");

    }

    @Override
    public void hope() {
        System.out.println("黑人会.....");

    }
}
