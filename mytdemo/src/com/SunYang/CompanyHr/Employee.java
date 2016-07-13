package com.SunYang.CompanyHr;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * Created by Administrator on 2016/7/6.
 */
public class Employee extends Person{
//  驼峰标识，首字母小写，剩余单词首字母大写；
    public  static int nextId = 1;
    private  int Id  = assignId();
    private String name = "";
    private Date hireDay;//   Camel 标识
    private double salary;
// set ID 使用静态方法 static method
    private  static int assignId () {
        int r = nextId;
        nextId ++;
        return r;
    }

    public Employee(String name,double salary,int year ,int month ,int day) {
        super(name);
        this.salary = salary;
//        Id = nextId;
//        nextId ++;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        hireDay = calendar.getTime();
    }

// setter
    public void setName (String n) {
        super.setName(n);
    }
    public void sethireday (Date date) {
        hireDay = date;
    }
    public void setSalary (double wages) {
        salary = wages;
    }
    public void setSalary (double wages,double bypercent) {
        salary += wages *bypercent/100;
    }

    public void setID(int Id) {
        Id = nextId;
        nextId ++;
    }

    // getter
    public String getName () {
        return super.getName();
    }
    public Date getHireday () {
        return hireDay;
    }
    public double getSalary () {
        return salary;
    }
    public int getId() {
        return Id;
    }
    public static int getNextId() {
        return nextId;
    }

    //implements  the abstract method

    @Override
    public String getDescription() {
        return this.getName() + " Hello World " ;
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;  //判断是否为同一引用
        if (otherObject == null) return false; //判断是否为 nulll
        if (getClass() != otherObject.getClass()) return false; //判断是否为同一类对象

        Employee other = (Employee)otherObject;//对象强制转换为相应类型的变量。
//        return name.equals(other.name)
//               && salary == other.salary
//               && hireDay.equals(other.hireDay);
        return Objects.equals(name,other.name) //返回两个对象比较的结果。
                && salary == other.salary
                && Objects.equals(hireDay,other.hireDay);
    }

    public String toString() {
        return getClass().getName() +"["
                + "name = " + getName()
                + ";salary = " + salary
                + ";hireDay = " + hireDay
                + "]";
    }
}
