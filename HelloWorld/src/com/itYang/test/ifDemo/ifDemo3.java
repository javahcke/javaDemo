package com.itYang.test.ifDemo;

public class ifDemo3 {
    public static void main(String[] args) {
       /* 需求：定义一个小数表示考试成绩
        判断学生考试成绩，如果大于60分输出通过，否则输出不及格*/
        // 1.定义一个小数表示考试成绩
        double score = 60;

        // 2.先对成绩是否合理进行判断
        if (score >= 0 && score <= 100) {
            System.out.println("成绩合法");
            // 2.判断学生成绩如果大于60分输出通过，否则输出不及格
            if (score >= 60) {
                System.out.println("通过");
            } else {
                System.out.println("不及格");
            }
        } else {
            System.out.println("成绩不合法");
        }



    }
}
