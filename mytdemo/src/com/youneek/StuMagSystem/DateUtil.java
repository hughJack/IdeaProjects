package com.youneek.StuMagSystem;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Administrator on 2016/5/13.
 */
public class DateUtil {
    /*Date createDate (int year,int month,int date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DAY_OF_MONTH, date);
        return calendar.getTime();
    }*/
    //重构，使用静态变量和静态方法
    private DateUtil () {}
        public static Date createDate (int year,int month,int date) {
            //我里个擦，这个居然是阳历。。。。gregorian calendar
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DAY_OF_MONTH, date);
        return calendar.getTime();
    }
}
