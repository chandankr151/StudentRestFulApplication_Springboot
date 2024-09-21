package com.chandan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandan.entity.Student;
import com.chandan.service.StudentService;

@RestController
@RequestMapping("/api/")
public class HomeController {

	@Autowired
	private StudentService studentService;

	@PostMapping(path = { "add", "update" })
	public Student createStudent(@RequestBody Student student) {

		return studentService.createStudent(student);
	}
	
	@GetMapping(path = "/getAll")
	public List<Student> getAllStudent(){
		
		return studentService.getAllStudent();
	}
	
	@DeleteMapping(path = "/deleteById/{id}")
	public String deleteStudent(@PathVariable int id) {
		
		return studentService.deleteStudentById(id);
	}
	
	@PutMapping(path = "/updateById/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
		
		
		return studentService.updateStudent(id, student);
	}
}
