package com.hqjl.design.pattern.strategy;

/**
 * @Description: 策略模式——计谋有了，那还要有锦囊
 * @Author qin
 * @Date 2018/2/6
 */
public class Context {

    private IStrategy strategy;

    // 构造方法，需要使用锦囊
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    // 使用计谋
    public void operate() {
        this.strategy.operate();
    }
}
