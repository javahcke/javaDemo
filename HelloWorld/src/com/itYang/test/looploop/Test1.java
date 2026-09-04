package com.itYang.test.looploop;

import jdk.swing.interop.SwingInterOpUtils;

public class Test1 {
    static void main() {
//        for (int i = 1; i <= 4; i++) {
//
//            for (int j = 1; j <= 5; j++) {
//                System.out.print('*');
//            };
//            System.out.println();
//        }
        for (int i = 5; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
