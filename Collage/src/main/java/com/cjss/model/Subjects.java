package com.cjss.model;

public class Subjects {
    private Integer subjectId;
    private String subjectName;
    private Integer year;
    private Branch branch;

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
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

    @Override
    public String toString() {
        return "Subjects{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", year=" + year +
                ", branch=" + branch +
                '}';
    }
}
