package com.youneek.AlwaysUsedClass;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Administrator on 2016/7/4.
 */
public class CalendarTest {

    public static void main(String[] args) {
        //construct d as current date
        GregorianCalendar d = new GregorianCalendar();
        //
        int today  = d.get(Calendar.DAY_OF_MONTH);
        int month  = d.get(Calendar.MONTH);

        //set d to start date of the month
        d.set(Calendar.DAY_OF_MONTH,1);
        int weekday = d.get(Calendar.DAY_OF_WEEK);

        //get first day of week
        int firstDayOfWeek = d.getFirstDayOfWeek();

        //determine the required intention for the first line
        int indent = 0;
        while (weekday != firstDayOfWeek) {
            indent ++;
            d.add(Calendar.DAY_OF_MONTH,-1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
            System.out.println(weekday);
        }
        System.out.println();

        //print weekday names
        String [] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        do {
            System.out.printf("%4s",weekdayNames[weekday]);
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        } while (weekday != firstDayOfWeek);
        System.out.println();

        for (int i = 1;i <= indent;i++) {
            System.out.print("    ");
        }
        d.set(Calendar.DAY_OF_MONTH,1);

        do {
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);

            if (day == today) {System.out.print("*");}
            else System.out.print(" ");

            d.add(Calendar.DAY_OF_MONTH,1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
            if (weekday ==firstDayOfWeek) { System.out.println();}
        }while (d.get(Calendar.MONTH) == month);
    }
}