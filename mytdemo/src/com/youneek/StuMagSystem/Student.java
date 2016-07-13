package com.youneek.StuMagSystem;

    /**
    * Created by Administrator on 2016/5/9.
    */
public class Student {
    private String name;
    private int credits;
    static final int  Credits_Required_For_FullTime = 12;
    static final String INSTATE = "CO";
     private   String state = "";


    Student (String name)
    {
        this.name = name;
          credits = 0;//显式初始化为0;
    }

    String getName()
    {
        return name;
    }

    boolean isFullTime()
    {
        return credits >= Credits_Required_For_FullTime;
    }

    int getCredits ()
    {
        return credits;
    }

    void addCredits (int credits) {
        this.credits += credits;
    }

        void setState(String state) {
            this.state = state;
        }

        boolean isInState () {
            return state.equals(Student.INSTATE);
        }
}
