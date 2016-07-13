package com.youneek.InputOutputDemo;

import java.io.*;

/**
 * Created by Administrator on 2016/5/25.
 */
public class ObjectIODemo {
    public static void main(String[] args) {
        TestObject T = new TestObject();
        T.k = 2;
        try {
        //对象的反序列化
            FileOutputStream fos = new FileOutputStream("F:/Java电子书/TestObject.dat");
            ObjectOutputStream oos = new ObjectOutputStream (fos);

            oos.writeObject(T);
            oos.flush();
            oos.close();
        }catch (IOException  e) {
            e.printStackTrace();
        }

        try {
        //对象的反序列化
            FileInputStream fis = new FileInputStream("F:/Java电子书/TestObject.dat");
            ObjectInputStream ois = new ObjectInputStream (fis);

            TestObject tReader = (TestObject)ois.readObject();
            System.out.println(tReader.i +" " + tReader.j + " " +tReader.k );
        }catch (IOException e2) { e2.printStackTrace();}
         catch (ClassNotFoundException e3)  { e3.printStackTrace();}
    }
}
//编译器看到这个实例化的标记“Serializable”之后，就可以对其进行序列化
class TestObject implements Serializable{
    int i = 1;
    double j = 5;
    float k = 10;
}
