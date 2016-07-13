package com.youneek.InputOutputDemo;

import java.io.*;

/**
 * Created by Administrator on 2016/5/25.
 */
public class DataStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);

        try {
            dos.writeBoolean(true);
            dos.writeFloat(85);
            dos.writeBoolean(false);
            //为什么此处不是dos????
            // dos 只是一个接口？一个处理流？
            // 使对象转化为字节流时方便，最终还是调用的 baos 变量；
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            DataInputStream dis = new DataInputStream(bais);
            System.out.println(bais.available());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readFloat());
            System.out.println(dis.readBoolean());
        }catch (IOException e) {e.printStackTrace();}
    }
}
