package com.hqjl.design.pattern.strategy;

/**
 * @Description: 策略模式——赔了夫人又折兵
 * @Author qin
 * @Date 2018/2/6
 */
public class BackDoor implements IStrategy {

    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
