package com.itYang.test.controllerloop;

public class BreakDemo1 {
    static void main() {
        for (int i = 0; i < 100; i++) {
            if(i == 15) {
                break;
            }
            System.out.println(i);
        }
    }
}
