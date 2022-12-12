/**
 * @ yaitianpeng
 * @date 2022-12-12 下午9:16
 */
package com.yantianpeng.day_1212;

public class if_Demo01 {
    public static void main(String[] args) {
        double d = Math.random();//生成[0,1)之间的随即小数
        //生成[1,6]
        int i =1+(int)(Math.random()*6);
        int j=1+(int)(Math.random()*6);
        int k=1+(int)(Math.random()*6);
        int count = i+j+k;
        if(count>15){
            System.out.println("手气很不错");
        }
        if(10<=count &&count<=15){
            System.out.println("手气还可以");
        }
        if(count<10){
            System.out.println("手气一般");
        }
        System.out.println(count);
    }
}
