package com.cjss.model;

import java.util.List;

public class Staff {
    private Integer staffId;
    private String staffName;
    private String staffEmail;
    private List<Subjects> subjects;
    private AttendanceStaff attendance;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public List<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subjects> subjects) {
        this.subjects = subjects;
    }

    public AttendanceStaff getAttendance() {
        return attendance;
    }

    public void setAttendance(AttendanceStaff attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                ", staffEmail='" + staffEmail + '\'' +
                ", subjects=" + subjects +
                ", attendance=" + attendance +
                '}';
    }
}
