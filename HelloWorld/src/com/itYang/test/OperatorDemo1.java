package com.itYang.test;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class OperatorDemo1 {
    public static void main(String[] args) {

        // 1，定义变量记录秒数
        int seconds = 3661;

        // 2, 计算小时数
        int hours = seconds / 3600;
        System.out.println(hours);

        // 3, 计算分钟数
        int minutes = seconds % 3600 / 60;
        System.out.println(minutes);

        // 4,计算秒数
        int secondsLeft = seconds % 60;
        System.out.println(secondsLeft);
        System.out.println(hours + "小时" + minutes + "分钟" + secondsLeft + "秒");

        char c = 'B';
        char cc = (char)(c + 32);
        System.out.println(cc);

        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入我的身高");
        double height = sc.nextDouble();
        System.out.println("请输入你的身高");
        double yourHeight = sc.nextDouble();

        boolean result = height > yourHeight;
        System.out.println("结果是：" + result);*/

        // 键盘录入一个三位数，判断是否可以被三整除
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = sc.nextInt();

        boolean result = number % 3 == 0;
        System.out.println("结果是：" + result);
    }
}
