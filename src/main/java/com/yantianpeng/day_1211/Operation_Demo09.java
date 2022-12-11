/**
 * @ yaitianpeng
 * @date 2022-12-11 下午8:54
 */
package com.yantianpeng.day_1211;

public class Operation_Demo09 {
    public static void main(String[] args) {
        double d1 = 3.14;
        int a1 = (int)d1; //结果是3
        System.out.println(a1);

        //如果超过范围啦就会被截断成完全不想干的数值
        int a = 300;
        byte b =(byte)a;
        System.out.println(b);
        // 97 没有超过char的表示范围
        int a2 = 97;
        System.out.println((char)a2);

        //表示年薪 10亿
        int salary=1000000000;
        //表示10年
        int year = 10;
        //结果不是100亿 因为100亿超过啦int的表示范围，因此会发生溢出的现象导致结果不准确
        System.out.println(year*salary);
        //解决方案: 将其中的一个因子(year)表示转换为long类型
        System.out.println((long)year*salary);
    }
}
