package com.hqjl.design.pattern.strategy;

/**
 * @Description: 策略模式——赔了夫人又折兵
 * @Author qin
 * @Date 2018/2/6
 */
public class OpenGreenLight implements IStrategy {

    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行！");
    }
}
