/**
 * @ yaitianpeng
 * @date 2022-12-12 下午9:51
 */
package com.yantianpeng.day_1212;

public class if_else_Demo02 {

    public static void main(String[] args) {
        double r = Math.random()*4;//生成[0,4)之间的随机数
        double area = Math.PI*r*r;//计算面积
        double circle = 2*Math.PI*r;//计算周长
        if(area>=circle){
            System.out.println("面积是:"+area+",周长是:"+circle+",面积大于等于周长");
        }else {
            System.out.println("面积是:"+area+",周长是:"+circle+",面积小于周长");
        }
    }
}
