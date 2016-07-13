package com.youneek.InputOutputDemo;

import java.io.*;
import java.util.Date;

/**
 * Created by Administrator on 2016/5/26.
 * 日志操作
 */
public class PrintStreamDemo {
    public static void main(String[] args) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            //创建对象，传输地址，调用方法，数据输出，通道关闭。
            //FileWriter  和 FileOutputStream 的区别？？？？使用过程中的选择？？？
            //使用 true 关键字，使程序不会被覆盖，而是连接。
            //PrintWriter？？？？
            FileWriter  fw  = new FileWriter( "D:/logfile.log" ,true);
            PrintWriter log = new PrintWriter(fw);
            while ((s = br.readLine()) != null) {
                if (s.equalsIgnoreCase("exit")){ break;}
                System.out.println(s.toUpperCase());
                log.println("-------");
                log.println(s.toUpperCase());
                log.flush();
            }
            log.println("======"+ new Date() + "====");
            log.flush();
            log.close();
        }catch (IOException e) {e.printStackTrace();}
    }
}
