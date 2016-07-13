package com.youneek.demo1;

/**
 * Created by Administrator on 2016/4/24.
 */
class SuperClass {
    private int number;

    public SuperClass() {
        this.number = 0;
    }

    public SuperClass(int number) {
        this.number = number;
    }

    public int getNumber() {
        //父类的方法使用父类的成员变量
        number++;
        return number;
    }
}

class SubClass1 extends SuperClass {
    public SubClass1(int number) {
        super(number);
        //System.out.println(number);
    }
}

class SubClass2 extends SuperClass {
    private int number;

    public SubClass2(int number) {
        super(number);
    }
}

public class SubClass extends SuperClass {
    //成员变量是定义，在堆heap空间
    private int number = 5;

    public SubClass(int number) {
        //public SubClass(int number)中的局部变量 number 定义在 stack 空间,方法调用结束则，删除。
        super(number); //调用的是父类的构造函数 SuperClass（int number ）
        //调用的是父类的 函数，得到的是成员变量的 20+1=21
//      System.out.println(super.getNumber());
        //调用的是子类的 函数，得到的是成员变量的  5+1=6
//       System.out.println(this.getNumber());
        //修改成员变量的值，得到的是成员变量的  20+1=21
//        this.number = number;
//        System.out.println(this.getNumber());
    }

    public int getNumber() {
        number++;     //子类的方法使用的是子类的   成员变量，因此，number++ == 6
        return number;
    }


    public static void main(String[] args) {
        //SuperClass s  = new SubClass (20);
        SuperClass s1 = new SubClass1(20);
        //SuperClass s2 = new SubClass2(20);
        //System.out.println(s.getNumber());//调用的是“子类”的方法， 方法中没有重定义的number,因此使用的是成员变量
        System.out.println(s1.getNumber());//调用的是“父类”的方法，方法中没有重定义的number,因此使用的是成员变量
        //System.out.println(s2.getNumber());//调用的是”父类“的方法，方法中没有重定义的number,因此使用的是成员变量
        //结论一：多态时，当子类覆盖了父类的方法，使用子类覆盖的方法
        //结论二：当子类覆盖父类的成员变量时，父类方法使用的是父类的成员变量，子类方法使用的是子类的成员变量
    }

}
