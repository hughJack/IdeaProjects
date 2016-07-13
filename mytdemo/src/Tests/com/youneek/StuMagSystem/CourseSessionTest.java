package com.youneek.StuMagSystem;

import junit.framework.TestCase;
import java.util.Date;

/**
 * Created by Administrator on 2016/5/9.
 */
    public class CourseSessionTest extends TestCase {
    //创建学分绩
    private static final int CREDITS = 3;
    private CourseSession session ;
    Date startDate;
    Student student1;
    Student student2;
    //测试中setUp();方法与其他测试方法的关系？？？setUp();testCount();总共调用了CourseSession.createCourseSessionInstance 3 次，而并不是3 啊 最后。
    public void setUp () {
        System.out.println("执行 setUp");
        startDate = DateUtil.createDate(2016, 1, 6);
         session  = createCourseSession();
    }

    public void testCreate () {
        System.out.println("执行 testCreat");
        assertEquals("Java", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberOfStudents());
        assertEquals(startDate, session.getStartDate());
     }

    public void testEnrollStudents () {
        System.out.println("执行 testEnrollStudents");
        student1 = new Student("XiaoMing");
        student2 = new Student("XiaoHong");

        session.enroll(student1);
        assertEquals(CREDITS, student1.getCredits());
        assertEquals(1, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));

        session.enroll(student2);
        assertEquals(CREDITS, student2.getCredits());
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));
        assertEquals(student2, session.get(1));
    }

    public void testCourseDates() {
        System.out.println("执行 testCourseDates ");
        System.out.println(session.getStartDate());
        Date sixteenWeekOut = DateUtil.createDate(2016, 4, 24);
        System.out.println(session.getEndDate());
        assertEquals(sixteenWeekOut,session.getEndDate());
    }

    public void testCount () {
        System.out.println("执行 testCount ");
        CourseSession.resetCount();
        CourseSession.create("English1", "102", startDate);
        assertEquals(1, CourseSession.getCount());
        CourseSession.create("English2", "102", startDate);
        assertEquals(2, CourseSession.getCount());
    }

    //待重构的地方是，科目不止一个，学生不止一个，首先单独一个课程设定完毕。然后扩展到其他课程。
    //在课程中添加学生的情况；
    //课程是主要的“静态数据源”，首先生成报告
    //学生是流动的“提取显示”，待定。
    private CourseSession createCourseSession() {
            CourseSession   session  = CourseSession.create("Java", "101", startDate);
            session.setNumberOfCredits(CREDITS);
            return session;
    }

}