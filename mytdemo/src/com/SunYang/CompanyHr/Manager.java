package com.SunYang.CompanyHr;

/**
 * Created by Administrator on 2016/7/8.
 */
public class Manager extends Employee {//在填写继承的而过程中  尽量是用复制，很容易出错；
                                       // 重写和重载方法时，也一样。
    private double bonus ;
    public Manager (String name,double salary,int year ,int month ,int day) {
        super(name,salary,year,month,day);
        bonus  = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary+ bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public boolean equals(Object otherObject) {
        if( !super.equals(otherObject))  return false;
        Manager other = (Manager)otherObject;
        return bonus == other.bonus;
    }

    public String toString () {
        return super.toString()
                + "[bonus =" + bonus
                + "]";
    }

}
