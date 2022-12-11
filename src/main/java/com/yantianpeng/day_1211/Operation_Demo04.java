/**
 * @ yaitianpeng
 * @date 2022-12-11 下午6:30
 */
package com.yantianpeng.day_1211;

public class Operation_Demo04 {

    public static void main(String[] args) {
        //测试逻辑运算符
        boolean b1= false;
        boolean b2= true;
        System.out.println(b1&b2);//与:有一个为false 结果是false
        System.out.println(b1|b2);//或:有一个为true 结果是true
        System.out.println(!b1);//非: 取反 !
        System.out.println(b1^b2);//异或: 相同为true 不同为false

        //短路计算规则:从左到右计算,如果通过运算符左边的操作数就可以确定该逻辑表达式的值,
        // 则不会计算运算符右边的操作数,提高效率
        //短路与
        //0不能当除数,当遇到0是除数的时候程序会报错 但是&&是短路计算
        boolean b3 = 1>2 &&(4<3/0);
        System.out.println(b3);
        //短路或
        boolean b4 = 1<2 ||(4<3/0);
        System.out.println(b4);
    }
}
