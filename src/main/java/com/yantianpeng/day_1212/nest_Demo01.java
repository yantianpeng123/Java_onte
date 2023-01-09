/**
 * @ yaitianpeng
 * @date 2022-12-17 下午3:52
 */
package com.yantianpeng.day_1212;

public class nest_Demo01 {

    public static void main(String[] args) {

        //嵌套for循环
        for (int i = 0; i <10 ; i++) {
            for (int j = 1; j <i+1 ; j++) {
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }
    }
}
