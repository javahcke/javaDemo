package com.itYang.test.controllerloop;

import java.util.Scanner;

public class BreakDemo2 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int number = 0;
        while(true) {
            System.out.println("请输入一个大于等于2的整数：");
            number = sc.nextInt();
            if (number >= 2) {
                break;
            }else {
                System.out.println("输入的数字小于2，请重新输入。");
            }
        }
//        System.out.println("输入的数字是：" + number);
        int count = 0;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(number + "是质数。");
        } else {
            System.out.println(number + "不是质数。");
        }
    }
}
