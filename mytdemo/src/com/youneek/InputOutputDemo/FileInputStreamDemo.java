package com.youneek.InputOutputDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2016/5/24.
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream   in = null;
        FileOutputStream out = null;
        //显示初始化
        int  byt = 0;
    try {
        in  = new FileInputStream("F:/Java电子书/末日爱国者.txt");
        out = new FileOutputStream("F:/Java电子书/末日爱国者copy2.txt");
        while ( (byt=in.read()) != -1) {
            out.write(byt);
            System.out.println((char) byt);
        }
        //使用完之后关闭管道
        in.close();
        //使用完之后关闭管道
        out.close();
    }catch (FileNotFoundException e1) {
        e1.printStackTrace();
        System.out.println("File not found！");System.exit(-1);
    }catch (IOException e2) {
        System.out.println("文件读取出错");    System.exit(-1);
    }finally {
        System.out.println("文件复制成功");
    }
    }
}
