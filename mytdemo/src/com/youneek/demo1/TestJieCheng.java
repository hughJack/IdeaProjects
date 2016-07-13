package com.youneek.demo1;

/**
 * Created by Administrator on 2016/4/15.
 */
public class TestJieCheng {
    public static void main(String[] args) {
        int j=1;
        int sum=0;
        for (int i=1;i<=3;i++){
            j=j*i;
            sum = sum + j;
        }
        System.out.println(sum);
    }
}
