package com.cjss.service;

import com.cjss.model.Staff;
import com.cjss.model.Student;
import com.cjss.model.Subjects;
import com.sun.jdi.IntegerValue;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class CollageService {
    private List<Student> studentsList = new ArrayList<>();
    private List<Staff> staffsList = new ArrayList<>();

    public List<Student> saveStudent(Student student){
//        Set<Map.Entry<LocalDate, Boolean>> attendanceEntry = student.getAttendance().getAttendance().entrySet();
//        for (Map.Entry<LocalDate, Boolean> attendance: attendanceEntry) {
//             LocalDate date = attendance.getKey();
//            LocalDate dat = LocalDate.parse("2023-07-11");
//
//
//        }
        studentsList.add(student);
        return studentsList;
    }

    public List<Staff> saveStaff(Staff staff){
        staffsList.add(staff);
        return staffsList;
    }

    public List<Student> getStudentById(Integer id){
        return studentsList.stream().filter(std -> std.getStudentId() == id).collect(Collectors.toList());
    }

    public List<Staff> getStaffById(Integer id) {
        return staffsList.stream().filter(staff -> staff.getStaffId() == id).collect(Collectors.toList());
    }

    public List<Student> getAllStudents() {
        return studentsList;
    }

    public List<Staff> getAllStaffs() {
        return staffsList;
    }

    public List<Staff> updateStaff(Staff staff) {
        Optional<Staff> optionalStaff = staffsList.stream().filter(staff1-> staff1.getStaffId() == staff.getStaffId()).findAny();
        if (optionalStaff.isPresent()){
            Staff staff1 = new Staff();
            staff1.setStaffId(staff.getStaffId());
            staff1.setStaffName(staff.getStaffName());
            staff1.setStaffEmail(staff.getStaffEmail());
            staff1.setSubjects(staff.getSubjects());
            staff1.setAttendance(staff.getAttendance());
            for (int i = 0; i < staffsList.size(); i++){
                if(staffsList.get(i).getStaffId() == staff.getStaffId()){
                    staffsList.set(i, staff1);
                    break;
                }
            }
        }
        return staffsList;
    }

    public List<Student> updateStudent(Student student){
        Optional<Student> optionalStudent = studentsList.stream().filter(std -> std.getStudentId() == student.getStudentId()).findAny();
        if (optionalStudent.isPresent()){
            Student std = new Student();
            std.setStudentId(student.getStudentId());
            std.setStudentName(student.getStudentName());
            std.setStudentEmail(student.getStudentEmail());
            std.setYear(student.getYear());
            std.setBranch(student.getBranch());
            std.setMarks(student.getMarks());
            std.setAttendance(student.getAttendance());
            for (int i = 0; i < studentsList.size(); i++){
                if (studentsList.get(i).getStudentId() == student.getStudentId()){
                    studentsList.set(i, std);
                    break;
                }
            }
        }
        return studentsList;
    }

    public List<Student> deleteStudent(Integer id){
        Optional<Student> optionalStudent = studentsList.stream().filter(std -> std.getStudentId() == id).findAny();
        optionalStudent.ifPresent(std -> studentsList.remove(std));
        return studentsList;
    }

    public List<Staff> deleteStaff(Integer id){
        Optional<Staff> optionalStudent = staffsList.stream().filter(staff -> staff.getStaffId() == id).findAny();
        optionalStudent.ifPresent(staff -> staffsList.remove(staff));
        return staffsList;
    }

    public List<Student> studentsInYearOne(Integer year){
        return studentsList.stream().filter(std -> std.getYear() == year).collect(Collectors.toList());
    }

    public List<Staff> staffInYearOne(Integer year){
        return staffsList.stream().filter(staff ->staff.getSubjects().stream().anyMatch(st -> st.getYear() == year)).collect(Collectors.toList());
    }

    public List<Student> getStudentByPresentAndBranch(String branch){
        return studentsList.stream().filter(std -> {
            Set<Map.Entry<LocalDate, Boolean>> newStd = std.getAttendance().getAttendance().entrySet();
            for (Map.Entry<LocalDate, Boolean> studEntry : newStd)
                if (studEntry.getKey().isEqual(LocalDate.now()) && studEntry.getValue())
                    if (std.getBranch().getBranchName().equalsIgnoreCase(branch))
                        return true;
            return false;
        }).collect(Collectors.toList());
    }

    public List<Staff> getStaffByPresentAndSubject(String subject){
        return staffsList.stream().filter(staff -> {
            Set<Map.Entry<LocalDate, Boolean>> newStaff = staff.getAttendance().getAttendance().entrySet();
            for (Map.Entry<LocalDate, Boolean> staffEntry : newStaff)
                if (staffEntry.getKey().isEqual(LocalDate.now()) && staffEntry.getValue())
                    for (Subjects sub : staff.getSubjects())
                        if (sub.getSubjectName().equalsIgnoreCase(subject))
                            return true;
            return false;
        }).collect(Collectors.toList());
    }

    public List<Student> getStudentWhoAreFailByYear(Integer year){
        return studentsList.stream().filter(std -> std.getYear() == year).filter(std -> {
            Set<Map.Entry<String, Subjects>> stdMarks = std.getMarks().getMarks().entrySet();
            for (Map.Entry<String, Subjects> newStdMarks : stdMarks)
                if (Integer.parseInt(newStdMarks.getKey()) < 40)
                    return true;

            return false;
        }).collect(Collectors.toList());
    }

    public List<Staff> getStaffBySubjectCount(Integer count){
        return staffsList.stream().filter(staff -> staff.getSubjects().size() >= count).collect(Collectors.toList());
    }
}
