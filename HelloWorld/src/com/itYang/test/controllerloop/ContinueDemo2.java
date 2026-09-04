package com.itYang.test.controllerloop;

import java.util.Scanner;

public class ContinueDemo2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            if(i % 4 == 0 || i % 10 == 4 || i / 10 % 10 == 4){
//                System.out.println('过');
                continue;
            }
            System.out.println(i);
        }
    }
}
