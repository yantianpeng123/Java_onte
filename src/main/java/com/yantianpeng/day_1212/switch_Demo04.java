/**
 * @ yaitianpeng
 * @date 2022-12-14 下午9:12
 */
package com.yantianpeng.day_1212;

public class switch_Demo04 {

    public static void main(String[] args) {
        //生成1～6之间随机数
        int num = (int)(Math.random()*5)+1;
        switch (num){
            case 1:
                System.out.println("当前的数字是1");
                break;
            case 2:
                System.out.println("当前的数字是2");
                break;
            case 3:
                System.out.println("当前的数字是3");
                break;
            case 4:
                System.out.println("当前的数字是4");
                break;
            case 5:
                System.out.println("当前的数字是5");
                break;
            case 6:
                System.out.println("当前的数字是6");
                break;
            default:
                System.out.println("数字不合法");
                break;
        }

    }


}
