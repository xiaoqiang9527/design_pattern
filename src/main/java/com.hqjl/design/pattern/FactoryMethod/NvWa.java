package com.hqjl.design.pattern.FactoryMethod;

/**
 * @Description: 工厂模式——找个神仙姐姐来造人
 * @Author qin
 * @Date 2018/2/6
 */
public class NvWa {

    public static void main(String[] args) {

        // 女娲第一次造人，试验性质，少造点，火候不足，缺陷产品
        System.out.println("造出的第一批人是这样的：白人");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.cry();

        // 女娲第二次造人，火候加足点，然后又出了个次品，黑人
        System.out.println("\n造出的第二批人是这样的：黑人");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.laugh();

        // 第三批人了，这次火候掌握的正好，ChinaMan
        System.out.println("\n造出的第三批人是这样的：黄皮肤");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.laugh();
        yellowHuman.happy();
        yellowHuman.cry();
        yellowHuman.talk();
        yellowHuman.hope();

        // 女娲烦躁了，爱啥啥，燃烧吧
//        for (int i = 0; i < 10000; i++) {
//            System.out.println("\n\n------------随机产生人类了-----------------" + i);
//            Human human = HumanFactory.createHuman();
//            human.cry();
//            human.laugh();
//            human.talk();
//        }
    }

}
