/**
 * @ yaitianpeng
 * @date 2022-12-17 下午4:21
 */
package com.yantianpeng.day_1212;

public class continue_Demo01 {

    public static void main(String[] args) {
        //把100到150之间不可以被3整除的每行打印5个
        int count =0;//计数器
        for (int i = 100; i <151 ; i++) {
            if(i%3==0){
                continue;
            }
            count++;
            System.out.print(i+"\t");
            if(count%5==0) System.out.println();//判断是否是一行显示5个
        }
    }
}
