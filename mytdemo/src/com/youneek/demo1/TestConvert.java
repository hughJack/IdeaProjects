package com.youneek.demo1;

import java.net.SocketPermission;

/**
 * Created by Administrator on 2016/4/14.
 */
public class TestConvert {
    public static void main(String arg[]){
      int i=1,j=12;
      float f1=0.1f;
      float f2 = 123;
      long l1=12345678,l2=888888888L;
        double d1 = 2e20,d2=124;
        byte b1=1,b2=2,b3=127;
        j=j+10;                     System.out.println(j);
        i=i/10;                     System.out.println(i);
        i=(int)(i*0.1);             System.out.println(i);
        char c1 = 'a',c2=125;
        byte b=(byte)(b1-b2);
        char c=(char)(c1+c2-1);    System.out.println(c1+c2-1);
        float f3 = f1+f2;
        float f4 = (float)(f1+f2*0.1);
        double d =d1*i+j;
        float f = (float)(d1*5+d2);

    }
}
