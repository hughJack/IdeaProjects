package com.SunYang.CompanyHr;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2016/7/8.
 */
public class ManagerTest extends TestCase {

    public void  testCreat () {

        Employee [] staff = new Employee[6];
        Manager Boss = new Manager ("Sun Lei",      500000, 1987, 7,  26);        Boss.setBonus(200000);
        staff[0] = Boss;
        staff[1] = new Employee("Sun Yang",     320000, 1989, 10, 20);
        staff[2] = new Employee("Wang Kaishen", 250000, 1989, 10, 20);
        staff[3] = new Employee("He Jianjian",  140000, 1989, 10, 20);
        staff[4] = new Employee("Zhou Tiezhu",  140000, 1989, 10, 20);
        staff[5] = new Employee("Yang Liwei",   120000, 1989, 10, 20);

        for (Employee e : staff) {
            System.out.println("ID = " + e.getId() + ";name = " + e.getName() + ";salary = " + e.getSalary() + " RMB;HireDay = " + e.getHireday());
        }
//      instancof  子类/父类  返回都是 ture  不能区分实际上  是那一个类！！！
        System.out.println(Boss instanceof Employee);
        System.out.println(Boss instanceof Manager );
//      返回的是实际上的类名  其实就是class文件存储的路径
        System.out.println(Boss.getClass());    // class com.SunYang.CompanyHr.Manager
        System.out.println(staff[1].getClass());// class com.SunYang.CompanyHr.Employee
        System.out.println(staff[1].getClass().getName());
        System.out.println(staff[1].getClass().getSimpleName());
//        Manager  ID000 = new Manager ("Sun Lei",      50000, 1987, 7,  26);        ID000.setBonus(200000);
//        Employee ID001 = new Employee("Sun Yang",     32000, 1989, 10, 20);
//        Employee ID002 = new Employee("Wang Kaishen", 25000, 1989, 10, 20);
//        Employee ID003 = new Employee("He Jianjian",  14000, 1989, 10, 20);
//        Employee ID004 = new Employee("Zhou Tiezhu",  14000, 1989, 10, 20);
//        Employee ID005 = new Employee("Yang Liwei",   12000, 1989, 10, 20);
//
//        System.out.println("ID = " + ID000.getId() + ";name = " + ID000.getName() + ";salary = " + ID000.getSalary() + " RMB;HireDay = " + ID000.getHireday());
//        System.out.println("ID = " + ID001.getId() + ";name = " + ID001.getName() + ";salary = " + ID001.getSalary() + " RMB;HireDay = " + ID001.getHireday());
//        System.out.println("ID = " + ID002.getId() + ";name = " + ID002.getName() + ";salary = " + ID002.getSalary() + " RMB;HireDay = " + ID002.getHireday());
//        System.out.println("ID = " + ID003.getId() + ";name = " + ID003.getName() + ";salary = " + ID003.getSalary() + " RMB;HireDay = " + ID003.getHireday());
//        System.out.println("ID = " + ID004.getId() + ";name = " + ID004.getName() + ";salary = " + ID004.getSalary() + " RMB;HireDay = " + ID004.getHireday());
//        System.out.println("ID = " + ID005.getId() + ";name = " + ID005.getName() + ";salary = " + ID005.getSalary() + " RMB;HireDay = " + ID005.getHireday());

    }

}