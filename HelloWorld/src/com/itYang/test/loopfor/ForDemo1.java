package com.itYang.test.loopfor;

import java.util.Scanner;

public class ForDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一数字：");

        int num1 = sc.nextInt();
        System.out.println("请输入第二数字：");
        int num2 = sc.nextInt();
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;
        int count = 0;
        for (int i = min; i <= max; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }
        if(count == 0){
            System.out.println(min + "~" + max + "之间没有3和5的倍数");
        }else {
            System.out.println(min + "~" + max + "之间共有" + count + "个数是3的倍数和5的倍数");
        }

    }
}
