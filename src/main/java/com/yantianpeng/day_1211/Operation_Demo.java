/**
 * @ yaitianpeng
 * @date 2022-12-11 下午5:49
 */
package com.yantianpeng.day_1211;

public class Operation_Demo {

    public static void main(String[] args) {
        int a =3;
        int b = a++;//执行完之后,b等于3 先把a的值赋值给b,a的值自增 b的值没有发生变化，只是a的值发生了变化
        System.out.println(b);
        int c =3;
        int d = ++c;//执行完之后,d等于3 先把c的值增加1 c的值为4 在赋值给d
        System.out.println(d);
    }
}
