/**
 * @ yaitianpeng
 * @date 2022-12-17 下午4:11
 */
package com.yantianpeng.day_1212;

public class break_Demo01 {

    public static void main(String[] args) {
        int total =0;//用来计算循环次数
        while (true){
            total++;
            int i = (int)(Math.round(100*Math.random()));
            if (i==88){
                break;//遇到break的时候,循环会停止执行
            }
        }
        System.out.println("总共循环了"+total+"次");
    }
}
