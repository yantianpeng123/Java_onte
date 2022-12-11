/**
 * @ yaitianpeng
 * @date 2022-12-11 下午6:16
 */
package com.yantianpeng.day_1211;

public class Operation_Demo03 {
    public static void main(String[] args) {
        int a =3;
        int b =4;
        boolean f1 = a>b;
        System.out.println(f1);
        boolean f2 = a<b;
        System.out.println(f2);
        //char的范围是0～65535之间,所有的字符都可以在char类型中对应这一个数字,
        // 可以使用(int)变量名强制转换为int类型查看
        char c = 'a';
        System.out.println((int)c);
        char c1 = '~';
        System.out.println((int)c1);
    }
}
