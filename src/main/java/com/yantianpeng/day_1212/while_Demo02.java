/**
 * @ yaitianpeng
 * @date 2022-12-16 下午9:28
 */
package com.yantianpeng.day_1212;

public class while_Demo02 {

    public static void main(String[] args) {
        int i=0;
        int sum =0;
        do {
            sum+=i;
            i+=1;
        }while (i<101);
        System.out.println(sum);
    }
}
