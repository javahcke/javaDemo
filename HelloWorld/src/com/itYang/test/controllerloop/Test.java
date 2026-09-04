package com.itYang.test.controllerloop;

import java.util.Random;
import java.util.Scanner;

public class Test {
    static void main() {
        /*生成一个1-100之间的随机数，利用键盘录入模拟猜的动作，直到猜中为止*/
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int n = r.nextInt(1, 101);
//        System.out.println(n);
        int countA = 0;
        int countB = 0;
        while (true) {
            System.out.println("请输入你的猜测：");
            int guess = sc.nextInt();

            countA++;
            countB++;

            if(countB == 10) {
                guess = n;
            }

            if(guess > n) {
                System.out.println("太大了");
            } else if (guess < n) {
                System.out.println("太小了");
            } else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
            int min = (n - 5) < 1 ? 1 : n - 5;
            int max = (n + 5) > 100 ? 100 : n + 5;
            if(countA % 3 == 0) {
                System.out.println("你已经猜了" + countA + "次，随机数字范围值：" + min + "到" + max);
            }
        }
    }
}
