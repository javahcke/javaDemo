package com.itYang.test.method;

import java.util.Scanner;

public class MethodDemo3 {
    static void main() {
        /*
        跳水比赛有五个评委打分，分数在0-100之间。最终得分会去掉一个最高分，去掉一个最低分，
        剩余的分数在求平均数，改平均数为选手最终得分。
        要求1：利用键盘录入5个整数存入数组当中，如果分数超出范围需要重新录入
        要求2：定义方法分别求数组的最大值，和最小值
        要求3：计算五名评分的总分
        要求4：总分 - 最大值 - 最小值，求选手最终平均分
        */
        int[] scores = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的评分：");
            int score = sc.nextInt();
            while (score < 0 || score > 100) {
                System.out.println("输入的评分超出范围，请重新输入：");
                score = sc.nextInt();
            }
            scores[i] = score;
        }
        int max = getMax(scores);
        int min = getMin(scores);
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        System.out.println("选手的总分是：" + sum );
        System.out.println("选手的最高分是：" + max);
        System.out.println("选手的最低分是：" + min);
        System.out.println("选手去掉最高分和最低分后的最终平均分是：" + (sum - max - min) / (scores.length - 2));
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
    static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
