package com.SunYang.CompanyHr;

/**
 * Created by Administrator on 2016/7/8.
 */
public class Student extends Person {

    private String major;
    public Student (String name,String major) {
        super(name);
        this.major = major;
    }
    @Override
    public String getDescription() {
        return super.getName() + " is a student major in " + major + ".";
    }


}
