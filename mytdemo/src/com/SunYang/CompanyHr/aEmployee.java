package com.SunYang.CompanyHr;

/**
 * Created by Administrator on 2016/7/7.
 */
public class aEmployee {
    public static int nextId;
    private String name = "";
    private double salary = 0;
    private int id = 0;

    //object initialization block
    {
        id = nextId  ;
        nextId ++;
    }

    public aEmployee () {
//     name   initialized to "";
//     salary initialized to 0;
//     id     initialized in initialization block;
    }
    public aEmployee (String name,double salary) {
        this.name   = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
