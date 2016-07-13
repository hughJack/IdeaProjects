package com.SunYang.CompanyHr;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/7/6.
 */
public class EmployeeTest extends TestCase {
    public void testCreat() {

//        ArrayList <Employee> list = new ArrayList();
//        list.add(new Employee("Sun Yang",     32000, 1989, 10, 20));
//        list.add(new Employee("Wang Kaishen", 25000, 1989, 10, 20));
//        list.add(new Employee("He Jianjian",  14000, 1989, 10, 20));
//        list.add(new Employee("Zhou Tiezhu",  14000, 1989, 10, 20));
//        list.add(new Employee("Yang Liwei",   12000, 1989, 10, 20));
//
//        for (Employee e: list) {
//            System.out.println(e);
//        }
        ArrayList <Integer> integerArraylist = new ArrayList<Integer>();
        integerArraylist.add(3);                    //自动装箱，将基本数据类型数据打包成Integer.valueOf(3)   对象。
        System.out.println(integerArraylist.get(0));//自动拆箱，从Integer对象 获取integerArraylist.get(0).intValue();基本类型数据
//        Employee ID001 = new Employee("Sun Yang",     32000, 1989, 10, 20);System.out.println(ID001.getId());
//        Employee ID002 = new Employee("Wang Kaishen", 25000, 1989, 10, 20);System.out.println(ID002.getId());
//        Employee ID003 = new Employee("He Jianjian",  14000, 1989, 10, 20);System.out.println(ID003.getId());
//        Employee ID004 = new Employee("Zhou Tiezhu",  14000, 1989, 10, 20);System.out.println(ID004.getId());
//        Employee ID005 = new Employee("Yang Liwei",   12000, 1989, 10, 20);System.out.println(ID005.getId());
//        System.out.println("name = " + ID001.getName() + ";salary = " + ID001.getSalary() + " RMB;HireDay = " + ID001.getHireday());
//        System.out.println("ID001 to String :" + ID001);


//        System.out.println();
//        GregorianCalendar d = new GregorianCalendar();//  在此处默认赋值，，当前时间。
//        System.out.println(d.getTime());
//        int today = d.get(Calendar.DAY_OF_MONTH);
//        int month = d.get(Calendar.MONTH);
//        System.out.println(today);
//        System.out.println(month);
    }
}