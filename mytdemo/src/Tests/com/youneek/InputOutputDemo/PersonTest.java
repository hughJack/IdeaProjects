package com.youneek.InputOutputDemo;

import junit.framework.TestCase;

import java.io.*;

/**
 * Created by Administrator on 2016/5/26.
 */
public class PersonTest extends TestCase {
     public void testSerializeToDisk() {
    //对象的序列化
        try {
            Person XiaMin = new Person("Xiaoming","wang",28,Gender.MALE);            Person XiaHon = new Person("Xiaohong","Yang",28,Gender.FEMALE);
            XiaMin.setSpouse(XiaHon);            XiaHon.setSpouse(XiaMin);

            FileOutputStream fos = new FileOutputStream("F:/Java电子书/PersonOutputStream.dat");
            ObjectOutputStream oos = new ObjectOutputStream (fos);
    //此处容易出错？？？目前还不知道错在哪里，该如何改。
            oos.writeObject(XiaMin);
            oos.flush();
            oos.close();
        }catch( FileNotFoundException e) {e.printStackTrace();}
         catch (IOException e2){e2.printStackTrace();}
    //对象的反序列化
        try { FileInputStream fis = new FileInputStream("F:/Java电子书/PersonOutputStream.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person XM = (Person)ois.readObject();
            ois.close();
            assertEquals("Xiaoming",XM.getFirstName());
            assertEquals("Xiaohong",XM.getSpouse().getFirstName());

        }catch( FileNotFoundException e3) {e3.printStackTrace();}
         catch (IOException e4){e4.printStackTrace();}
         catch (ClassNotFoundException e5) {e5.printStackTrace();}
    }
}