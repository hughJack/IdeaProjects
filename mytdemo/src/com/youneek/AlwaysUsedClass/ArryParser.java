package com.youneek.AlwaysUsedClass;

import sun.security.util.Length;

/**
 * Created by Administrator on 2016/4/30.
 */
//需要实现的功能，返回一个double类型的二维数组，数组元素通过解析字符串获得
public class ArryParser {
    public static void main(String[] args) {
        String s = "1,2;3,4,5;6,7,8";
        String [] sm = s.split(";");
//如何定义2维数组？？？？？？？？？？？？？
        double [][] save;
        save = new double[sm.length][];

        for (int i = 0;i < sm.length;i++) {
            //System.out.println(sm[i]);
            //for (int j=0; j< sm[i].length();j++) {
              String s1[] =  sm[i].split(",");
             save[i] = new double[s1.length];

            for ( int j = 0;j < s1.length;j++) {
                //System.out.print( s1[j] +" ");
                save[i][j] =  Double.parseDouble( s1[j] );
                //System.out.println(save[i][j]);
            }
        }
System.out.println(save.length);
        System.out.println(save[0].length);
        System.out.println(save[1].length);
        System.out.println(save[2].length);
        for (int i = 0;i< save.length;i++) {
            for (int j = 0;j<save[i].length;j++) {
                System.out.print(save[i][j] + " ");
            }
            System.out.println();
        }
    }
}

