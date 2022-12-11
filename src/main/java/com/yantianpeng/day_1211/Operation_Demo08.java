/**
 * @ yaitianpeng
 * @date 2022-12-11 下午7:36
 */
package com.yantianpeng.day_1211;

public class Operation_Demo08 {
    //自动类型转换
    public static void main(String[] args) {
        int a  =1234;
        long b = a; //可以从int类型转换为long类型(可以从容量小的类型转为容量大的类型)
//        int c =b; 错误类型 不可以从容量大的转换为容量下的类型
        double d= a; //可以转换
        float e =a; // 可以转换
        //特例:整数常量是int类型,可以自动转换为byte short char 只要不超过对应类型的表示范围即可
        byte b1 = 123;
//        byte b2= 1234; byte类型的范围是-128到127
        char h =97; //会自动把97转换为char对应的符号
        System.out.println(h);

    }
}
