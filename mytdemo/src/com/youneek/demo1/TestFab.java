package com.youneek.demo1;

/**
 * Created by Administrator on 2016/4/15.
 */
public class TestFab {
    public static void main(String[] args) {
        System.out.println( fab(0) );
    }
    public static long fab(int n ) {
        if (n<1) {
        System.out.println("Invalid Parament");
            return -1;
        }
        long f = 0L; //
        long f1 = 1;
        long f2 = 1;
        for (int i=3; i<=n;i++) {
            f = f1 + f2;
            f1 = f2;
            f2= f;
        }
        return f;

    }
}
