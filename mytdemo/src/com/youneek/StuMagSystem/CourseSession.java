package com.youneek.StuMagSystem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Administrator on 2016/5/9.
 */
public class CourseSession {
    private String department;
    private String number;
    private Date startDate;
    private static int count;
    private int numberOfCredits;

    void  setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
    ArrayList < Student > students = new ArrayList< Student>();

    CourseSession (String department,String number) {
        this.department = department;
        this.number = number;
        CourseSession.incrementCount();
    }

    private CourseSession (String department,String number,Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;
        CourseSession.incrementCount();
        System.out.println("课程名为 "+ department);
    }
    //使用工厂模式创建CourseSession对象，使用静态方法的优缺点？？？
    public static CourseSession create (String department,
                                                             String number,
                                                             Date startDate) {
        return new CourseSession( department,number,startDate);
    }



    static int  getCount   () { return CourseSession.count ;}
    static void resetCount () { CourseSession.count = 0;}
    private static void incrementCount () {
        ++ CourseSession.count;// = CourseSession.count+1;
        System.out.println("目前为止共创建了" + count + "门课程");
    }

    String getDepartment() {
        return department;
    }

    String getNumber() {
        return number;
    }

    int getNumberOfStudents() {
        return students.size();
    }

    void enroll (Student student) {
        student.addCredits(numberOfCredits);
        students.add(student);
    }

    Student get ( int index) {
        return students.get(index);
    }
    Date getStartDate() {
        return startDate;
    }
    ArrayList<Student> getAllStudents () {
        return students;
    }

    Date getEndDate () {
        final int sessionLength = 16;
        final int daysInWeek = 7;
        final int daysFromFridayToMonday = 3;
        int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday;

        GregorianCalendar calendar = new GregorianCalendar ();
        calendar.setTime(startDate);
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

}
