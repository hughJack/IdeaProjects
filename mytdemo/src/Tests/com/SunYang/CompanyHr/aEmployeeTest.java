package com.SunYang.CompanyHr;//将类“aEmployeeTest”放入包 “com.SunYang.CompanyHr” 中

import junit.framework.TestCase;

/**
 * Created by Administrator on 2016/7/7.
 */
public class aEmployeeTest extends TestCase {

    public void testCreat() {
//      尝试静态变量的运行  结果
        aEmployee ID001 = new aEmployee("Sun Yang",     32000);System.out.println("ID = " + ID001.getId() + "; name " + ID001.getName() + "; salary " + ID001.getSalary());
        aEmployee ID002 = new aEmployee("Wang Kaishen", 25000);System.out.println("ID = " + ID002.getId() + "; name " + ID002.getName() + "; salary " + ID002.getSalary());
        aEmployee ID003 = new aEmployee("He Jianjian",  14000);System.out.println("ID = " + ID003.getId() + "; name " + ID003.getName() + "; salary " + ID003.getSalary());
    }




}