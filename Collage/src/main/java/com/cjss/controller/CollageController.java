package com.cjss.controller;

import com.cjss.model.Staff;
import com.cjss.model.Student;
import com.cjss.service.CollageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CollageController {
    @Autowired
    private CollageService collageService;

    @PostMapping("student-save")
    public List<Student> saveStudent(@RequestBody Student student){

        return collageService.saveStudent(student);
    }

    @PostMapping("staff-save")
    public List<Staff> saveStaff(@RequestBody Staff staff){

        return collageService.saveStaff(staff);
    }

    @GetMapping("student-get/{id}")
    public List<Student> getStudentById(@PathVariable Integer id){
        return collageService.getStudentById(id);
    }

    @GetMapping("staff-get/{id}")
    public List<Staff> getStaffById(@PathVariable Integer id){
        return collageService.getStaffById(id);
    }

    @GetMapping("student-get")
    public List<Student> getStudents(){
        return collageService.getAllStudents();
    }

    @GetMapping("staff-get")
    public List<Staff> getStaffs(){
        return collageService.getAllStaffs();
    }

    @PutMapping("student-update")
    public List<Student> updateStudent(@RequestBody Student student){
        return collageService.updateStudent(student);
    }

    @PostMapping("staff-update")
    public List<Staff> updateStaff(@RequestBody Staff staff){
        return collageService.updateStaff(staff);
    }

    @DeleteMapping("student-delete/{id}")
    public List<Student> deleteStudentById(@PathVariable Integer id){
        return collageService.deleteStudent(id);
    }

    @DeleteMapping("staff-delete/{id}")
    public List<Staff> deleteStaffById(@PathVariable Integer id){
        return collageService.deleteStaff(id);
    }

    @GetMapping("get-student-year/{year}")
    public List<Student> getStudentsByYear(@PathVariable Integer year){
        return collageService.studentsInYearOne(year);
    }

    @GetMapping("get-staff-year/{year}")
    public List<Staff> getStaffByYear(@PathVariable Integer year){
        return collageService.staffInYearOne(year);
    }

    @GetMapping("get-student-present/{branch}")
    public List<Student> getStudentsByPresentAndBranch(@PathVariable String branch){
        return collageService.getStudentByPresentAndBranch(branch);
    }

    @GetMapping("get-staff-present/{subject}")
    public List<Staff> getStaffByPresentAndSubject(@PathVariable String subject){
        return collageService.getStaffByPresentAndSubject(subject);
    }

    @GetMapping("get-student-fail/{year}")
    public List<Student> getStudentWhoAreFailByYear(@PathVariable Integer year){
        return collageService.getStudentWhoAreFailByYear(year);
    }

    @GetMapping("get-staff-subject/{count}")
    public List<Staff> getStaffBySubjectCount(@PathVariable Integer count){
        return collageService.getStaffBySubjectCount(count);
    }

}
