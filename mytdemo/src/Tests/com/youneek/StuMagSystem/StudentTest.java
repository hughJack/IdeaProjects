package com.youneek.StuMagSystem;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2016/5/9.
 */
    public class StudentTest extends TestCase {
        public void testCreat(){
            final  String firstStudentName = "John";
            Student firststudent = new Student(firstStudentName);
            // firststudent.name = "Bill";
            assertEquals( firstStudentName , firststudent.getName() );

            final  String secondStudentName = "John2";
            Student secondstudent = new Student(secondStudentName);
            assertEquals(secondStudentName , secondstudent.getName());
    }

    public void testFullTime () {
        Student student  = new Student ("John3");
        assertEquals(0,student.getCredits());
        assertFalse("not enough credits for FullTime  status",student.isFullTime());

        student.addCredits(3);
        assertEquals(3, student.getCredits());
        assertFalse("not enough credits for FullTime  status",student.isFullTime());

        student.addCredits(4);
        assertEquals(7, student.getCredits());
        assertFalse("not enough credits for FullTime  status",student.isFullTime());

        student.addCredits(5);
        assertEquals(12, student.getCredits());
        assertTrue(" enough credits for FullTime  status",student.isFullTime());

        student.addCredits(6);
        assertEquals(18, student.getCredits());
        assertTrue(" enough credits for FullTime  status",student.isFullTime());
    }

    public void testINState() {
        Student student = new Student("Ming");
        assertFalse(student.isInState());
        student.setState("CO");
        assertTrue(student.isInState());
        student.setState("MD");
        assertFalse(student.isInState());

    }




    public void testCredits()  {}

}