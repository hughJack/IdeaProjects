package com.youneek.InputOutputDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2016/5/25.
 */
public class TransformDemo {
    public static void main(String[] args) {
        //System.in ; 接受的是键盘的输入
        InputStreamReader  isr = new InputStreamReader(System.in);
        BufferedReader bk = new BufferedReader(isr);
        String str = null;

        try {
            str = bk.readLine();
            while (str!=null){
                //equals 和 ==  出来的结果完全不一样啊！！！输入“exit”不能实现运行的程序“退出”
                //==是操作符，比较的是不是同一个引用，同一个内存地址。。。值类型的话，直接用==就可以。
                //equals是超类Object额一个方法，判断两个引用指向的内存   是不是相同的东西。内容是不是一样。
                if (str.equalsIgnoreCase( "exit")) {  break;}
                System.out.println(str.toUpperCase());
                //这句话如果没有的话，在控制台输入hello之后，console会一直循环输出  HELLO;
                str = bk.readLine();
            }
            bk.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
