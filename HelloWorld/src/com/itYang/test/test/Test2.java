package com.itYang.test.test;

import java.util.Random;

public class Test2 {
    static void main() {
        int money = 20000;

        int n = 5;

        if(money < n) {
            System.out.println("金额不足");
        }else {
            Random r = new Random();
            for (int i = 1; i < n; i++) {
                int myMoney = r.nextInt(money - (n-i)) + 1;
                System.out.println("第" + i + "个人抽到的金额是：" + myMoney / 100.0  + "元");
                money -= myMoney;
            }
            System.out.println("第" + n + "个人抽到的金额是：" + money / 100.0 + "元");
        }


    }
}
