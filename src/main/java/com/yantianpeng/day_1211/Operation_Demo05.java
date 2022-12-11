/**
 * @ yaitianpeng
 * @date 2022-12-11 下午6:43
 */
package com.yantianpeng.day_1211;

public class Operation_Demo05 {
    public static void main(String[] args) {
        int a =7;//0111
        int b =8;//1000
        System.out.println(a&b);//结果:0
        System.out.println(a|b);//结果:15
        System.out.println(a^b);//结果:15
        System.out.println(-b);//结果:-9


        //移位:
        // <<n 相当于n个2相乘在乘原来的数
        int c =5;
        System.out.println(c<<3);//:5*2*2*2
        // >>n 相当于原来的数除以n的2相乘的结果
        System.out.println(40>>3); //:40/2*2*2
    }
}
