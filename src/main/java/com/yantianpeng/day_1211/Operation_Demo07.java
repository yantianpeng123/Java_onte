/**
 * @ yaitianpeng
 * @date 2022-12-11 下午7:08
 */
package com.yantianpeng.day_1211;

public class Operation_Demo07 {

    public static void main(String[] args) {
        int num1 =90;
        int num2 =100;
        int max = num1>num2?num1:num2;
        System.out.println(max);


        //计算三个数中的最大值
        int num3 = 89;
        int max1 = (num1>num2?num1:num2)>num3?(num1>num2?num1:num2):num3;
        System.out.println(max1);
    }
}
