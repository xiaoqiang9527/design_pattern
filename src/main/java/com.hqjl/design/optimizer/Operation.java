package com.hqjl.design.optimizer;

/**
 * @Description:
 * @Author qin
 * @Date 2018/2/5
 */
public class Operation {

    private static final String[] NUMBER = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};

    private static final String[] UNIT = {"", "十", "百", "千"};

    private double _numberA = 0;

    private double _numberB = 0;

    public double get_numberA() {
        return _numberA;
    }

    public void set_numberA(double _numberA) {
        this._numberA = _numberA;
    }

    public double get_numberB() {
        return _numberB;
    }

    public void set_numberB(double _numberB) {
        this._numberB = _numberB;
    }


    public double getResults() {
        double result = 0;
        return result;
    }



    /**
     * 封装计算"+"，"-"，"*"，"/"
     */
    public static double getResult(double numberA, double numbetB, String operate) {

        double result = 0d;
        switch (operate) {
            case "+":
                result = numberA + numbetB;
                break;
            case "-":
                result = numberA + numbetB;
                break;
            case "*":
                result = numberA + numbetB;
                break;
            case "/":
                result = numberA / numbetB;
                break;
            default:
                break;
        }
        return result;
    }


    /**
     * 类型转化，输入1，2，3转化成一，二，三
     */
    private String getTimesLot(String group) {
        Integer timesLot = Integer.valueOf(group);
        //将输入数字转换为字符串
        String result = String.valueOf(timesLot + 1);
        //将该字符串分割为数组存放
        char[] ch = result.toCharArray();
        //返回结果 字符串
        String time = "";
        int length = ch.length;
        for (int i = 0; i < length; i++) {
            int c = (int) ch[i] - 48;
            if (c == 1 && length == 2 && length - i != i) {
                time += UNIT[c];
            } else if (c != 0 && c > 1) {
                time += NUMBER[c] + UNIT[length - i - 1];
            } else {
                time += NUMBER[c];
            }
        }
        return time;
    }

}
