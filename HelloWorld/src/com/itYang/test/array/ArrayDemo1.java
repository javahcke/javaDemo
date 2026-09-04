package com.itYang.test.array;

import java.util.Scanner;

public class ArrayDemo1 {
    static void main() {
        int[] ageArr1 = {10, 20, 30};
        for (int i = 0; i < ageArr1.length; i++) {
//            System.out.println(ageArr1[i]);
        }
        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入数字：");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i+1]);
        }
    }
}
