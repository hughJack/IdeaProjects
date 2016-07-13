package com.youneek.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/5/23.
 * 应用到集合的时候尽量使用：泛型，以避免给自己造成麻烦。
 */
public class ArgsDemo {
    public static void main(String[] args) {
        List <String> c = new ArrayList < String>();
        c.add("Xiaoming");
        c.add("Xiaoming");
        c.add("Xiaoming");

        for (String cL :c) {
            System.out.println(cL);
        }

        Collection <String> cc = new ArrayList<String>();
        cc.add("XioaHong");cc.add("XioaHong");cc.add("XioaHong");
//增强版的for循环？？没看懂源程序。
        //it是用于实现遍历的对象，不知道是什么玩意，指针还是地址，引用？？
        // 返回的应该是不一样的吧，对于set和list
        //i.hasNext();  只要下面还有值。就继续循环
        //并不是增强版的for循环，就是普通版本的for循环！！！
        // for(int i = 0;i<100;i++) {}  只是第三个语句省略了而已！！
        for(Iterator<String> it = cc.iterator();it.hasNext();) {
            String s = it.next();
            System.out.println(s);
        }
//这个可以看懂，
        for (String list: cc ) {
            System.out.println(list);
        }
    }
}

//class  MyName 实现  Comparable 接口，继承并实现里面的abstract方法 compareTo<T  o>
//compareTo 只跟自己的类比较   有意义
//Collections  和 Collection
//含有针对集合操作的 静态方法
//接口的地方不是很懂。
class MyName implements Comparable <MyName> {
    int age ;
    public int compareTo (MyName  mn) {
        if (this.age > mn.age) {return 1;}
        else if (this.age < mn.age) {return -1;}
        else return 0;
    }
}