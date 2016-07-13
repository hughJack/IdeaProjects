package com.youneek.StuMagSystem;

/**
 * Created by Administrator on 2016/5/13.
 */
public class RosterReport {

    static final String NEWLINE = System.getProperty("line.separator");
    static final String ROSTER_REPORT_HEADER = "Student" +  NEWLINE + "----" + NEWLINE;
    static final String ROSTER_REPORT_FOOTER =  NEWLINE + "# students";

    private CourseSession session;
    RosterReport (CourseSession session) {
        this.session = session;
    }

    String getRosterReport () {
        StringBuilder buffer = new StringBuilder();
        buffer.append(ROSTER_REPORT_HEADER);

        for ( Student student:session.getAllStudents()) {
            buffer.append(student.getName());
            buffer.append(NEWLINE);
        }

        buffer.append(ROSTER_REPORT_FOOTER + session.getAllStudents().size() + NEWLINE);
        return buffer.toString();
    }

    String getReport () {
        StringBuilder buffer = new StringBuilder ();
        writeHeader(buffer);
        writeBody(buffer);
        writeFooter(buffer);
        return buffer.toString();
    }

    void writeHeader(StringBuilder buffer) {
        buffer.append(ROSTER_REPORT_HEADER);
    }

    void writeBody(StringBuilder buffer ){
        for ( Student student:session.getAllStudents()) {
            buffer.append(student.getName());
            buffer.append(NEWLINE);
        }
    }

    void writeFooter(StringBuilder buffer ){
        buffer.append(
                ROSTER_REPORT_FOOTER + session.getAllStudents().size() + NEWLINE);
    }

}
