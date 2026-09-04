package com.itYang.test;

import java.util.Scanner;

public class OperatorDemo {
    public static void main(String[] args) {
        // 需求: 键盘录入一个三位数，将其拆分为个位，十位，百位后，打印在控制台

        // 1. 键盘录入一个三位数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");

        int number = sc.nextInt();
        System.out.println(number);

        int ge = number % 10;
        System.out.println(ge);

        int shi = number / 10 % 10;
        System.out.println(shi);

        int bai = number / 100 % 10;
        System.out.println(bai);
    }
}
