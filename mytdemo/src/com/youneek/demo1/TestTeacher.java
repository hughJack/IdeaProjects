package com.youneek.demo1;

import com.sun.org.apache.xpath.internal.operations.Equals;

/**
 * Created by Administrator on 2016/4/18.
 */
class testToString {
    int didi;
    float mawei;
    public String toString() {
        return "I'm a fierce Dog!";
    }

     public boolean equals(Object Obj) {
         if (Obj==null) {  return false;  }
         if (this == Obj) {  return true;  }
         else {
             if ( Obj instanceof testToString ) {
                 testToString pp = (testToString) Obj;
                 return this.didi == pp.didi && this.mawei == pp.mawei;
             }
             else
                 return false;
         }
     }
}

public class TestTeacher {
    public static void main(String[] args) {
        testToString d = new testToString();
        testToString d1 = new testToString();

        d. didi =  100; d. mawei = 200f;
        d1.didi =  100; d1.mawei = 300f;

        System.out.println("class is " + d.toString());
        System.out.println( d.equals(d1) );
    }
}