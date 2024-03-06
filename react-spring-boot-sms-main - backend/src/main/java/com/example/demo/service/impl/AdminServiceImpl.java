package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.AdminService;

@Service
	public class AdminServiceImpl implements AdminService {

	    @Autowired
	    private StudentRepository studentRepository;

	    @Override
	    public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }

	    @Override
	    public Student getStudentById(Long id) {
	        return studentRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Student saveStudent(Student student) {
	        return studentRepository.save(student);
	    }

	    @Override
	    public Student updateStudent(Long id, Student studentDetails) {
	        Student student = studentRepository.findById(id).orElse(null);
	        if (student != null) {
	            student.setName(studentDetails.getName());
	            student.setEmail(studentDetails.getEmail());
	            // Set other attributes
	            return studentRepository.save(student);
	        }
	        return null;
	    }

	    @Override
	    public void deleteStudent(Long id) {
	        studentRepository.deleteById(id);
	    }

			}


