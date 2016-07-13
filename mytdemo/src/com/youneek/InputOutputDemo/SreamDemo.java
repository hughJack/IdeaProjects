
package com.youneek.InputOutputDemo;

import java.io.*;

/**
 * Created by Administrator on 2016/5/24.
 * 对于程序来说是读入，
 * 对于程序来说是输出。
 */

public class SreamDemo {
    public static void main(String[] args) {
        File  firstFile = new File("F:/Java电子书/末日爱国者.txt") ;
        File secondFile = new File("F:/Java电子书/末日爱国者_copy.txt") ;
        BufferedReader in  = null;
        BufferedWriter out = null;
        try {//处理流，前后套了3层，为数据处理提供更强大的功能；
            //继承自InputStream的流，数据的单位是字节（8 bit）
            //Reader  读取的是两个字节，汉字什么的都是两个字节
            //InputStreamReader   把“字节流”转换为“字符流”
             in  = new BufferedReader(new InputStreamReader( new FileInputStream(firstFile)  ,"gbk"));
             out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(secondFile),"gbk"));
            String  line ;
            while (  (line = in.readLine()) != null) {//按行读取
                System.out.println(line);
                out.write(line + "\r\n"); //只有“\n”不能正确换行，需要添加“\r\n”
            }
        }catch (FileNotFoundException e1) {
            System.out.println("找不到指定的文件");
            System.exit(-1);
            }catch (IOException e2) {
            System.out.println("读取数据出错");
        }finally {
            if ( null != in ) {
                try {
                    in.close();
                }catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            if (null != out) {
                try {
                    out.close();
                }catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
        }
    }
}