package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Student;

public interface AdminService {

	List<Student> getAllStudents();

	Student getStudentById(Long id);

	Student saveStudent(Student student);

	Student updateStudent(Long id, Student studentDetails);

	void deleteStudent(Long id);

	

}
