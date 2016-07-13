package com.youneek.demo1;

import java.security.PublicKey;

/**
 * Created by Administrator on 2016/4/15.
 */
public class TestMethod {
    public static void main(String[] args) {
        m();
        m2(10);
       int rr = m3(5,10);
        System.out.println( "m3 返回值为 rr = " + rr);
    }

    public static void m() {
        System.out.print("I'm Method m() ");
        System.out.println(" 没有返回值");
    }

    public static void m2(int n) {
       int  result = 0;
        for(int i=1;i < n;i++){
            result = result + i;
        }
        System.out.print("I'm Method m2(int n) ");
        System.out.println("result = "+result);
    }

    public static int m3(int i,int j) {
        int result_m3 = i>j ? i : j;
        System.out.print("I'm Method m3(int n) ");
        System.out.println("result_m3 = " + result_m3);
        return result_m3;
    }

}
