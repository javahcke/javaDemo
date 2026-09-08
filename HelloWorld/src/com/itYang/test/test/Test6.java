package com.itYang.test.test;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    static void main() {
        int[] lotteryNumber = createLotteryNumber();
        int[] myLotteryNumber = buyLotteryNumber();
        printLotteryNumber(lotteryNumber);
        System.out.println();
        printLotteryNumber(myLotteryNumber);
        getWinningNumber(lotteryNumber, myLotteryNumber);
    }
    static void getWinningNumber(int[] arr1, int[] arr2) {
        int count1 = getCount(arr1, arr2, 0, 4);
        System.out.println("中奖个数为：" + count1);
        int count2 = getCount(arr1, arr2, 5, 6);
        System.out.println("中奖个数为：" + count2);
        if(count1 == 5 && count2 == 2){
            System.out.println("恭喜您，获得一等奖！");
        }else if(count1 == 5 && count2 == 1) {
            System.out.println("恭喜您，获得二等奖！");
        }else if(count1 == 5 && count2 == 0 || count1 == 4 && count2 == 2) {
            System.out.println("恭喜您，获得三等奖！");
        }else if(count1 == 4 && count2 == 1 || count1 == 3 && count2 == 2) {
            System.out.println("恭喜您，获得四等奖！");
        }else if(count1 == 4 && count2 == 0 || count1 == 3 && count2 == 1 || count1 == 2 && count2 == 2) {
            System.out.println("恭喜您，获得五等奖！");
        }else if(count1 == 3 && count2 == 0 || count1 == 1 && count2 == 2 || count1 == 2 && count2 == 1 || count1 == 0 && count2 == 2) {
            System.out.println("恭喜您，获得六等奖！");
        }else {
            System.out.println("您没有中奖");
        }
    }
    static int getCount(int[] arr1, int[] arr2,int start,int end) {
        int count = 0;
        for(int i = start; i<=end; i++) {
            boolean flag = contains(arr1[i], arr2, start, end);
            if(flag) {
                count++;
            }
        }
        return count;
    }
    static int[] buyLotteryNumber() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; ) {
            System.out.println("请输入彩票的第" + (i + 1) + "个数字：");
            int number = sc.nextInt();
            if(number < 0 || number > 35) {
                System.out.println("输入的数字无效，请重新输入！");
                continue;
            }
            boolean falg = contains(number, arr, 0, 4);
            if(falg) {
                System.out.println("输入的数字已存在，请重新输入！");
                continue;
            }
            arr[i] = number;
            i++;
        }
        for(int i = 0; i < 2;){
            System.out.println("请输入彩票的第" + (i + 6) + "个数字：");
            int number = sc.nextInt();
            if(number < 0 || number > 12) {
                System.out.println("输入的数字无效，请重新输入！");
                continue;
            }
            boolean falg = contains(number, arr, 5, 6);
            if(falg) {
                System.out.println("输入的数字已存在，请重新输入！");
                continue;
            }
            arr[i+5] = number;
            i++;
        }
        return arr;
    }
    static int[] createLotteryNumber() {
        int[] arr = new int[7];
        Random r = new Random();
        for(int i = 0; i < 5; ) {
            int number = r.nextInt(1, 36);
            boolean flag = contains(number, arr, 0, 4);
            if(!flag) {
                arr[i] = number;
                i++;
            }
        }
        for (int i = 5; i < arr.length; i++) {
            int number = r.nextInt(1, 13);
            boolean flag = contains(number, arr, 5, 6);
            if(!flag) {
                arr[i] = number;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
    static boolean contains(int number, int[] arr, int start, int end) {
        for(int i = start; i <= end; i++) {
            if(arr[i] == number) {
                return true;
            }
        }
        return false;
    }
    static void printLotteryNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
