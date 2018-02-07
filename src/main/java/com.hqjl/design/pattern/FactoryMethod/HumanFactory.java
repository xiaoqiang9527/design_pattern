package com.hqjl.design.pattern.FactoryMethod;

import java.util.HashMap;

/**
 * @Description: 工厂模式——定义一个烤箱或者魔术棒
 * @Author qin
 * @Date 2018/2/6
 */
public class HumanFactory {

    private static HashMap<String, Human> humans = new HashMap<>();

    //定一个烤箱，泥巴塞进去，人就出来，这个太先进了
    public static Human createHuman(Class c) {

        Human human = null;

        try {
            // 造一个人类出来
            if (humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            } else {
                human = (Human) Class.forName(c.getName()).newInstance();
            }
        } catch (InstantiationException e) {
            // 指定一个颜色
            System.out.println("必须指定人类的颜色");
        } catch (IllegalAccessException e) {
            // 定义的人类有问题，那就烤不出来了，这是..
            System.out.println("人类定义错误！");
        } catch (ClassNotFoundException e) {
            // 你随便说个人类，我到哪里给你制造去？！
            System.out.println("找不到这个人类");
        }

        return human;
    }
}
