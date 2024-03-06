package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.AdminService;
	
	@RestController
	@RequestMapping("/api/admins")
	@CrossOrigin(origins = "http://localhost:3000")
	public class AdminController {

	    @Autowired
	    private AdminService adminService;

	    @GetMapping("/allstudents")
	    public List<Student> getAllStudents() {
	        return adminService.getAllStudents();
	    }

	    @GetMapping("/studentsbyid/{id}")
	    public Student getStudentById(@PathVariable Long id) {
	        return adminService.getStudentById(id);
	    }

	    @PostMapping("/students")
	    public Student createStudent(@RequestBody Student student) {
	        return adminService.saveStudent(student);
	    }

	    @PutMapping("/students/{id}")
	    public Student updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
	        return adminService.updateStudent(id, studentDetails);
	    }

	    @DeleteMapping("/deletestudents/{id}")
	    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
	        adminService.deleteStudent(id);
	        return ResponseEntity.noContent().build();
	    }
	}

 