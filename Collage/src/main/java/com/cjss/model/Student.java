package com.cjss.model;

public class Student {
    private Integer studentId;
    private String studentName;
    private String studentEmail;
    private Integer year;
    private Branch branch;
    private AttendanceStudent attendance;
    private Marks marks;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public AttendanceStudent getAttendance() {
        return attendance;
    }

    public void setAttendance(AttendanceStudent attendance) {
        this.attendance = attendance;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", year=" + year +
                ", branch=" + branch +
                ", attendance=" + attendance +
                ", marks=" + marks +
                '}';
    }
}
