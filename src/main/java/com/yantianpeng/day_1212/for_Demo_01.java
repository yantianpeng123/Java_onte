/**
 * @ yaitianpeng
 * @date 2022-12-16 下午9:45
 */
package com.yantianpeng.day_1212;

public class for_Demo_01 {
    public static void main(String[] args) {
        //循环打印3次
        for(int i=0;i<3;i++){
            System.out.println("I Love U "+i);
        }
        //计算1到100的和
        int sum =0;
        for(int i =0;i<101;i++){
            sum+=i;
        }

        System.out.println("sum"+sum);


        char num1 = 'a';
        for (int i = 0; i <26 ; i++) {
            System.out.println((char)(num1+i));
        }
    }
}
