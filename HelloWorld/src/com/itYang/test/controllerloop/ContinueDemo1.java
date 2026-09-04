package com.itYang.test.controllerloop;

public class ContinueDemo1 {
    static void main() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
