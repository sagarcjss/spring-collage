package com.cjss.model;

import java.util.Map;

public class Marks {
    private Integer studentId;
    Map<String, Subjects > marks;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Map<String, Subjects> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Subjects> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "studentId=" + studentId +
                ", marks=" + marks +
                '}';
    }
}
