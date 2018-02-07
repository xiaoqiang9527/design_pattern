package com.hqjl.design.pattern.strategy;

/**
 * @Description: 策略模式——赔了夫人又折兵
 * @Author qin
 * @Date 2018/2/6
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
