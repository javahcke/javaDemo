package com.itYang.test.array;

import java.util.Scanner;

public class Test1 {
    static void main() {
        int[] arr = {33,5,22,44,55,33};
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入要查询的数字：");
//        int num = sc.nextInt();
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        System.out.println("数组中的最小值是：" + max);
    }
}
