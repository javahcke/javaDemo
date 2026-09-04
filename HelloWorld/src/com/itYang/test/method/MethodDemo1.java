package com.itYang.test.method;

public class MethodDemo1 {
    static void main() {
        int add = getSum(10, 20);
        System.out.println("The sum is: " + add);
    }
    static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
