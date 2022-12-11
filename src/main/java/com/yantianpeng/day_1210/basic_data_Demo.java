/**
 * @ yaitianpeng
 * @date 2022-12-10 下午10:29
 */
package com.yantianpeng.day_1210;

public class basic_data_Demo {

    public static void main(String[] args) {
        //基本数据类型
        byte  b1 =127;
        short s1 = 129;
        int i1 = 20000;

        int a =015;//表示八进制
        int b = 0x15;//表示十六进制
//        int c =0b01; Java中不显式支持二进制

        //在声明类型的时候需要在值后面加上一个L或者l;
        long l1 = 89L;
        long l2 = 89l;
        //声明一个char字符类型
        char c1 = 'S';
        //声明一个布尔类型
        boolean b2 = true;

        //使用科学计算法表示浮点型
        double dd = 314e2; //表示3.14*10的2次方
        System.out.println(dd);
        //在定义float类型的时候需要在数值后面加上f,表示float类型
        float ff=  1.65f;
        System.out.println(ff);
        //浮点型不精确 一般不直接比较大小
        float f1 = 122388883L;
        float f2= f1+1;
        System.out.println(f1==f2); //结果是true


        //char 类型
        char c2 ='s';
        char c3 ='张';
        char c4 ='2';

        char c5='\u0009';//表示制表符
        System.out.println(c5);
        char c6='\"';//表示双引号
        System.out.println(c6);

    }
}
