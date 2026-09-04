package com.itYang.test.looploop;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        for (int i = 1; i <= 9; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }

}
