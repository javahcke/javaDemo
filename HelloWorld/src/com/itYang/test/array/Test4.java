package com.itYang.test.array;

import java.util.Random;

public class Test4 {
    static void main() {
        /*
         * 需求：先获取10个0-100之间的随机数并存入到数组当中，要求保证数据是唯一的
         * */

        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < arr.length; ) {
            int num = r.nextInt(100);
            System.out.print(num + " ");

            int count = 0;
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if(!flag && num == 0) {
                    flag = true;
                    break;
                }
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
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
