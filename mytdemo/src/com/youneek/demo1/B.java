package com.youneek.demo1;
/**
 * Created by Administrator on 2016/4/18.
 */
class A {
    //函数 1 A()
             A() {System.out.println("A()");}
    //函数 2 f()
    public void f() {System.out.println("A:f()");}
}
class B extends A {
    B() {
        System.out.println("B()");}
    public void f() {
        System.out.println("B:f()");
    }
    public static void main(String[] args) {
        B b = new B();
        b.f();
    }
}

