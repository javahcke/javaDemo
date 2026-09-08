package com.itYang.test.method;

import java.util.Scanner;

public class MethodDemo4 {
    static void main() {
        /*
        * 班主任需要统计10名学生的数学成绩（0 - 100分）
        * 计算及格率（60分及以上为及格），平均分，并找出最高分
        * 要求1：键盘录入10名学生的数学成绩，存入数组。超出范围，提示“成绩无效，请重新输入”
        * 要求2：定义方法，求及格人数，根据及格人数，求及格率
        * 要求3：定义方法求总分，根据总分求平均分
        * 要求4：定义方法求最大值
        * */
        int[] scores = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "名学生的数学成绩：");
            int score = sc.nextInt();
            while (score < 0 || score > 100) {
                System.out.println("成绩无效，请重新输入：");
                score = sc.nextInt();
            }
            scores[i] = score;
        }

        System.out.println("及格人数为：" + getPassCount(scores));
        System.out.println("及格率为：" + getPassRate(scores));
        System.out.println("总分为：" + getSum(scores));
        System.out.println("平均分为：" + getSum(scores) * 1.0 / scores.length);
        System.out.println("最高分为：" + getMax(scores));

    }
    static int getPassCount(int[] arr) {
        int passCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 60) {
                passCount++;
            }
        }
        return passCount;
    }
    static double getPassRate(int[] arr) {
        return getPassCount(arr) * 1.0 / arr.length;
    }
    static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
