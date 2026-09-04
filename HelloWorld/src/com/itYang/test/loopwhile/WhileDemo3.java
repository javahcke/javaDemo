package com.itYang.test.loopwhile;

import java.util.Scanner;

public class WhileDemo3 {
    static void main() {
        /*double paper = 0.1;
        double height = 8848860;
        int count = 0;
        while (paper < height) {
            paper = paper * 2;
            count++;
        }
        System.out.println(count);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = sc.nextInt();

        if(number < 0) {
            number = -number;
        }
        int sum = 0;
        while (number != 0){
//            System.out.println(number % 10);
            sum = sum + number % 10;
            number = number / 10;
        }

        System.out.println("结果是：" + sum);
    }
}
