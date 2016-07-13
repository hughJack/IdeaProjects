package com.youneek.CollectionDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Administrator on 2016/5/22.
 * Map接口
 */
public class MapDemo {

    public static void main(String[] args) {
        Map <String,Integer>m1 = new TreeMap<String,Integer> ();
        Map <String,String> m2 = new TreeMap<String,String> ();
        m1.put("one",1);
        m1.put("two",2);
        m1.put("three",3);
        m2.put("A","A");
        m2.put("B","B");
        System.out.println(m1.size());
        System.out.println(m2.size());
        System.out.println(m1.containsKey("one"));
        System.out.println(m2.containsValue("A"));
        System.out.println(m2.containsValue("C"));
        //打印其中的值？？
        if (m1.containsKey("two")) {
            int i = m1.get("two");
            System.out.println(i);
        }
        if (m1.containsKey("two")) {
            System.out.println(m1.get("two"));
        }
        //泛型怎么做？？放入其中的而是两个不同类型的  Map 参数并不一样。
        Map m3 = new  HashMap();
        m3.putAll(m1);
        m3.putAll(m2);
        System.out.println(m3.size());
    }
}
