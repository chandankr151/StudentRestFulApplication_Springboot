package com.chandan.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandan.entity.Student;
import com.chandan.repository.StudentRepo;
import com.chandan.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student createStudent(Student student) {

		return studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {

		return studentRepo.findAll();
	}

	@Override
	public String deleteStudentById(int id) {

		studentRepo.deleteById(id);
		return "record deleted successfully";

	}

	@Override
	public Student updateStudent(int id,Student student) {

		Student byIdStudent = studentRepo.findById(id).get();

		byIdStudent.setName(student.getName());
		byIdStudent.setEmail(student.getEmail());
		byIdStudent.setAddr(student.getAddr());

		return studentRepo.save(byIdStudent);
	}
}
