package com.youneek.AlwaysUsedClass;

/**
 * Created by Administrator on 2016/4/29.
 */
public class TestString {
    public static void main(String[] args) {
        String s = "abcdef";
        String S = "abcdef";
        String m = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] L = new String [] {"abc"};
        String[] n = new String [] {"ade"};
        String str = "abc";
        String STR = "ABC";
        System.out.println(s.charAt(0));
        System.out.println(m.charAt(0));
        System.out.println(s.codePointAt(0));
        System.out.println(m.codePointAt(0));
        //System.out.println(s.codePointAt(1));
        //System.out.println(m.codePointAt(1));
        //System.out.println(s.codePointBefore(1));
        System.out.println(s.codePointCount(1, 5));//怎么是5？？
        //System.out.println(s.compareTo(m));//有什么价值？？
        //System.out.println(s.compareToIgnoreCase(m));
        //System.out.println(s.concat(m));
        //System.out.println(s.contains(str));
        //System.out.println(m.contains(STR));
        //System.out.println(s.contentEquals(m));
        //System.out.println(s.endsWith("Z"));
        System.out.println(s.equals(S));
        //System.out.println(s.);
        //System.out.println(s.);
        //System.out.println(s.);
        //System.out.println(s.);
        //System.out.println(s.);
        //System.out.println(s.);
        //System.out.println(s.);
    }
}

