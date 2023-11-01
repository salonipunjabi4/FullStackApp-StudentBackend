package com.sp.studentsystem.service;

import com.sp.studentsystem.model.Student;

import java.util.List;


public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();


}
