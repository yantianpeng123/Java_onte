/**
 * @ yaitianpeng
 * @date 2022-12-18 下午4:42
 */
package com.yantianpeng.day_1212;

import java.util.Scanner;

public class break_Demo02 {
    public static void main(String[] args) {
        System.out.println("年薪计算器:");
        Scanner sc= new Scanner(System.in);
        while (true){
            System.out.println("请输入命令,exit为退出,next为计算下一个人的年薪,其他命令为计算年薪");
            System.out.println("请输入月薪");
            int salary = sc.nextInt();
            System.out.println("请输入你的每年多少个约的工资:");
            int months = sc.nextInt();
            sc.nextLine();
            System.out.println("请输入命令:");
            String commnd = sc.nextLine();
            if (commnd.equals("exit")){
                break;
            }else if(commnd.equals("next")){
                continue;
            }else {
                System.out.println("你的年薪是:"+salary*months);
            }
        }
    }
}
