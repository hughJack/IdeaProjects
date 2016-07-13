package com.youneek.demo1;

/**
 * Created by Administrator on 2016/4/20.
 */
class StringA {
    int ivar = 7;
    void m1() {
        System.out.print("A's m1, ");
    }
    void m2() {
        System.out.print("A's m2, ");
    }
    void m3() {
        System.out.println("A's m3, "+ ivar);
    }
}
class StringB extends StringA {
    void m1() {
        System.out.print("B's m1, ");
    }
}
class StringC extends StringB {
    void m3() {
        System.out.println("C's m3, "+ ivar);
    }
}

public class TestOverRide {
    public static void main(String[] args) {
        StringA a = new StringA ();
        StringB b = new StringB ();
        StringC c = new StringC ();
        StringA d = new StringC ();
        //A
        a.m1();
        a.m2();
        a.m3();
        //B
        b.m1();
        b.m2();
        b.m3();
        //C
        c.m1();
        c.m2();
        c.m3();
        //D
        d.m1();
        d.m2();
        d.m3();
    }
}
