package com.itYang.test.loopwhile;

public class WhileDemo2 {
    static void main() {
        double money = 100000;
        int expectMoney = 200000;
        int year = 0;
        while (money < expectMoney) {
            money = money + money * 0.017;
            year++;
        }
        System.out.println("需要" + year + "年才能达到" + expectMoney + "元");
    }
}
