package com.hqjl.design.pattern.strategy;

/**
 * @Description: 策略模式——赵云推动者
 * @Author qin
 * @Date 2018/2/6
 */
public class handler {

    public static void main(String[] args) {
        Context context;
        System.out.println("---------到吴国拆第一个锦囊，看有啥好吃的--------");
        context = new Context(new BackDoor());//拿到妙计
        context.operate(); // 使用计谋
        System.out.println("\n");


        System.out.println("---------刘备大哥在温柔乡，赶紧拆第二锦囊--------");
        context = new Context(new OpenGreenLight()); //拿到妙计
        context.operate(); // 使用计谋
        System.out.println("\n");

        System.out.println("------妈呀，被人家打了，赶紧跑，看第三锦囊有啥----");
        context = new Context(new BlockEnemy());
        context.operate(); // 夫人退兵
        System.out.println("\n");

    }
}
