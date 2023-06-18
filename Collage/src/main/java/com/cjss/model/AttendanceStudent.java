package com.cjss.model;

import java.time.LocalDate;
import java.util.Map;

public class AttendanceStudent {
    private Integer studentId;
    private Map<LocalDate, Boolean> attendance;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Map<LocalDate, Boolean> getAttendance() {
        return attendance;
    }

    public void setAttendance(Map<LocalDate, Boolean> attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "AttendanceStudent{" +
                "studentId=" + studentId +
                ", attendance=" + attendance +
                '}';
    }
}
