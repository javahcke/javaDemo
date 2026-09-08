package com.itYang.test.method;

import java.util.Scanner;

public class MethodDemo5 {
    static void main() {
        /*
        * 快递公司的运费规则如下（首重1KG,超出部分按照KG计算，不足1KG按照1KG计算）
        * 首重1KG：10元
        * 超出1-5KG：每KG加2元
        * 超出5KG以上：每KG加1.5元
        * 输入快递的重量，输出运费
        * 要求1：快递重量必须大于0，否则重新输入
        * 要求2：不通价格的计算，单独定义一个方法
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入快递的重量：");
        double weight = sc.nextDouble();
        while (weight <= 0) {
            System.out.println("输入的重量无效，请重新输入：");
            weight = sc.nextDouble();
        }
        double basic = 10; // 基础运费
        double overtime = 0; // 超出1到5KG的运费
        double exceed = 0; // 超出5KG的运费
        overtime = calculateOvertime(weight);
        exceed = calculateExceed(weight);
        System.out.println("超出1-5KG的运费为：" + overtime + "元");
        System.out.println("超出5KG的运费为：" + exceed + "元");
        System.out.println("快递的运费为：" + (basic + overtime + exceed) + "元");
    }
    static double calculateOvertime(double weight) {
        if (weight > 1 ) {
           if( weight-1 <= 5 ) {
               return 2 * (weight - 1);
           }else {
               return 2 * 5;
           }
        }else {
            return 0;
        }
    }
    static double calculateExceed(double weight) {
        if (weight > 6) {
            return 1.5 * (weight - 6);
        } else {
            return 0;
        }
    }
}
