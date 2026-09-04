package com.itYang.test.array;

import java.util.Random;

public class Test3 {
    static void main() {

        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            int num = r.nextInt(100) + 1;
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == num) {
                    count++;
                    break;
                }
            }
            if(count == 0){
                arr[i] = num;
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
