package com.itYang.test.switchdemo;

public class SwitchDemo3 {
    static void main() {
        int number = 3;

        String name = switch (number) {
            case 1,2,3,4,5 -> "一";
            case 6,7,8 -> "二";
            case 9,10,11 -> "三";
            default -> "没有这个星期";
        };
        System.out.println(name);
    }
}
