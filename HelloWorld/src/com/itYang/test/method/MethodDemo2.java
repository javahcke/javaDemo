package com.itYang.test.method;

import java.util.Random;

public class MethodDemo2 {
    static void main() {
        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < arr.length; ) {
            int num = r.nextInt(100) + 1;
            System.out.print(num + " ");

            int count = 0;
            boolean flag = contains(arr, num);
            if(!flag){
                arr[i] = num;
                i++;
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
