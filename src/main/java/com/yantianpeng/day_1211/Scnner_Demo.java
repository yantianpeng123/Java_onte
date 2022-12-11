/**
 * @ yaitianpeng
 * @date 2022-12-11 下午9:24
 */
package com.yantianpeng.day_1211;

import java.util.Scanner;

public class Scnner_Demo {

    public static void main(String[] args) {
        //Scanner 获取用户的输入
        //System.in 表示获取的是控制台的输入
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入用户名称:");
        String uname = sc.nextLine();
        System.out.println("请输入你的年龄:");
        int age = sc.nextInt();
        System.out.println("请输入你的月薪:");
        double salary = sc.nextDouble();

        System.out.println("你的名称是:"+uname+",年龄是:"+age+",月薪是:"+salary);



    }
}
