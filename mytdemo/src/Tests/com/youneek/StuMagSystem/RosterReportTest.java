package com.youneek.StuMagSystem;

import junit.framework.TestCase;


/**
 * Created by Administrator on 2016/5/13.
 */
public class RosterReportTest extends TestCase {

    //public void setUp() throws Exception {
    //    super.setUp();
    //}

    public void testRosterReport () {
        CourseSession session = CourseSession.create ("算法（第四版","102", DateUtil.createDate(2016,1,6));
        session.enroll(new Student ("A") );
        session.enroll(new Student("B"));

        String rosterReport = new RosterReport(session).getRosterReport();
        System.err.println(rosterReport);
        assertEquals(RosterReport.ROSTER_REPORT_HEADER +
                "A" + RosterReport.NEWLINE +
                "B" + RosterReport.NEWLINE +
                RosterReport.ROSTER_REPORT_FOOTER + 2 +
                RosterReport.NEWLINE, rosterReport);
    }



}