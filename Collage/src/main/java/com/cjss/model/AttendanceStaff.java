package com.cjss.model;

import java.time.LocalDate;
import java.util.Map;

public class AttendanceStaff {
    private Integer staffId;
    private Map<LocalDate, Boolean> attendance;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Map<LocalDate, Boolean> getAttendance() {
        return attendance;
    }

    public void setAttendance(Map<LocalDate, Boolean> attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "AttendanceStaff{" +
                "staffId=" + staffId +
                ", attendance=" + attendance +
                '}';
    }
}
