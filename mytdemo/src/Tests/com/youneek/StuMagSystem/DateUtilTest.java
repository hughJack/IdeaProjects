package com.youneek.StuMagSystem;

import junit.framework.TestCase;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Administrator on 2016/5/13.
 */
public class DateUtilTest extends TestCase {

    public void testCreateDate () {
        //Date date = new DateUtil().createDate(2016,1,6);
        //重构上述代码，静态变量和静态方法
        Date date =  DateUtil.createDate(2016,1,6);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        assertEquals(2016,calendar.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY,calendar.get(Calendar.MONTH));
        assertEquals(6,calendar.get(Calendar.DAY_OF_MONTH));

    }
}