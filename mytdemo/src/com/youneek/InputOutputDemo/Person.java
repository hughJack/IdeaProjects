package com.youneek.InputOutputDemo;

import java.io.*;
import java.security.PrivateKey;

/**
 * Created by Administrator on 2016/5/26.
 * 关于
 * https://www.ibm.com/developerworks/cn/java/j-5things1/
 * 团队感到陷入僵局，但这只是因为他们不知道关于 Java 序列化的一个重要事实：Java 序列化允许随着时间的推移而改变类型。
 * 当我向他们展示如何自动进行序列化替换后，他们终于按计划完成了向 HashMap 的转变。
 * 本文是本系列的第一篇文章，这个系列专门揭示关于 Java 平台的一些有用的小知识 — 这些小知识不易理解，但对于解决 Java 编程挑战迟早有用。
 * 将 Java 对象序列化 API 作为开端是一个不错的选择，因为它从一开始就存在于 JDK 1.1 中。本文介绍的关于序列化的 5 件事情将说服您重新审视那些标准 Java API。
 */
enum Gender {
    MALE,FEMALE
}

public class Person implements Serializable{
    private String firstName;
    private String secondName;
    private  int  age;
    private Gender gender;
    private Person spouse;

    public Person (String firstName,String secondName,int age,Gender gender) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {return firstName;}
    public String getSecondName() {return secondName;}
    public int getAge() {return age;}
    public Gender getGender() {return gender;}
    public Person getSpouse() {return spouse;}

    public void setFirstName (String firstName) {this.firstName = firstName; }
    public void setSecondName(String secondName) {this.secondName = secondName; }
    public void setAge(int age) {this.age = age; }
    public void setGender(Gender gender) {this.gender = gender;}
    public void setSpouse(Person spouse) { this.spouse = spouse;}
    //模糊化序列数据，hook，编码
    private void writeObject(ObjectOutputStream stream) throws IOException{
        age = age >> 2;
        stream.defaultWriteObject();
    }
    /*//寻求代理
    private Object writeObject () {
        returm new PersonProxy(this);
    }*/
    //模糊化序列数据，hook,解码
    private void readObject(ObjectInputStream stream) throws IOException,ClassNotFoundException{
        stream.defaultReadObject();
        age = age << 2;
    }
}




class PersonProxy {
    public String data;
    public PersonProxy (Person origin) {
        data = origin.getFirstName() + "," + origin.getSecondName() + "," + origin.getAge() + origin.getGender();
        if (origin.getSpouse() != null) {
            Person spouse =origin.getSpouse();
            data = data + spouse.getFirstName() + "," + spouse.getSecondName() + "," + spouse.getAge();
        }
    }

    private Object readResolve () {
        String [] pieces = data.split(",");
        Person result = new Person(pieces[0],pieces[1],Integer.parseInt(pieces[2]),Gender.valueOf(pieces[3]) );
        if (pieces.length > 4) {
            result.setSpouse(new Person(pieces[4],pieces[5],Integer.parseInt(pieces[6]),Gender.valueOf(pieces[7])));
            //生成"XioaHong"这个对象，并设置ta的  spous e为 "xiaoming".
            result.getSpouse().setSpouse(result);
        }
        return result;
    }
}