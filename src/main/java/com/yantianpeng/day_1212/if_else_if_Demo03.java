/**
 * @ yaitianpeng
 * @date 2022-12-13 下午9:11
 */
package com.yantianpeng.day_1212;

public class if_else_if_Demo03 {

    public static void main(String[] args) {
        int age =(int)(100*Math.random());
        if (age<15){
            System.out.println("儿童,喜欢玩!");
        }else if(age<25){
            System.out.println("青年,要学习!");
        }else if(age<45){
            System.out.println("中年,要工作!");
        }else if(age<65){
            System.out.println("中老年,要补钙");
        }else if(age<85){
            System.out.println("老年,多运动");
        }else {
            System.out.println("老寿星,古来稀!");
        }
    }
}
