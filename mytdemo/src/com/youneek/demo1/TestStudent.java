package com.youneek.demo1;

/**
 * Created by Administrator on 2016/4/18.
 */
class TestPerson {
    private String name;
    private String location;
    TestPerson(String name) {
        this.name = name;
    }
    TestPerson (String name,String location) {
        this.name = name;
        this.location = location;
    }
    public String info() {
        //System.out.println("Name:" + name +" Location: " + location);
        return "Name: "+ name +" Location: "+location;
    }
}
class Student extends TestPerson{
    private String School;
    private String capital;
    private int year;

    Student(String n,String l) {
        this( n," Super ",l );    }
    Student(String n,String School,String l) {
        super(n,l);
        this.School = School;    }

    public String info() {
        return super.info() + " School: " + School;
    }
    }
public class TestStudent {
    public static void main(String[] args) {
        TestPerson p1 = new TestPerson( "Tom",   "ShangHai");
        TestPerson p2 = new TestPerson("John",   "北京");
        Student p3 = new Student("Lucy","Primary", "温哥华");
        Student p4 = new Student("Cherry","secondary ", "纽约");
        Student p5 = new Student("Cherry2","北京 ");
        System.out.println(p1.info());
        System.out.println(p2.info());
        System.out.println(p3.info());
        System.out.println(p4.info());
        System.out.println(p5.info());
    }
}