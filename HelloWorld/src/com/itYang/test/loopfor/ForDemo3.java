package com.itYang.test.loopfor;

import java.util.Scanner;

public class ForDemo3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                sum -= i;
            }else {
                sum += i;

            }
        }
        System.out.println("结果是：" + sum);
    }
}
