package com.itYang.test.ifDemo;

import java.util.Scanner;

public class ifDemo2 {
    public static void main(String[] args) {
        /*需求：初始化最大生命200，受到X点伤害，技能恢复Y点血，X和Y有键盘录入而来
        假设，游戏人物不会死亡，最少1点血
        问：最终游戏人物血量是多少？*/
        // 1. 定义变量记录游戏人物的生命值
        int hp = 200;

        // 2. 键盘录入一个值，表示当前人物受到的伤害
        System.out.println("请输入当前人物受到的伤害：");
        Scanner sc = new Scanner(System.in);
        int hurt = sc.nextInt();

        // 3. 计算当前的血量
        hp = hp - hurt;
        if (hp <= 0) {
            hp = 1;
        }
        System.out.println("当前游戏人物的血量是：" + hp);
        // 4. 键盘录入技能恢复的血量
        System.out.println("请输入技能恢复的血量：");
        int add = sc.nextInt();
        // 5. 计算最终的血量
        hp = hp + add;
        if (hp > 200) {
            hp = 200;
        }
        System.out.println("当前游戏人物的血量是：" + hp);

    }
}
