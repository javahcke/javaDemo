package com.itYang.test.test;

import java.util.Random;

public class Test4 {
    static void main() {
        int[] arr = new int[6];
        Random r = new Random();

        for (int i = 0; i < 1000; i++) {
            int num = r.nextInt(6);
            arr[num]++;
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.println("第" + i + "个候选人的得票数是：" + arr[i] + "得票率是：" + arr[i] * 1.0 / 1000 * 100 + "%");
        }

        int max = arr[1];
        for (int i = 2; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if(max == arr[i]) {
                System.out.println("第" + i + "个候选人票数最多，共计" + arr[i] + "票");
            }
        }
        System.out.println("弃票率是：" + arr[0] + ",弃票率是：" + arr[0] * 1.0 / 1000 * 100 + "%");

    }
}
