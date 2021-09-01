package com.servet.service;
import java.util.List;

import com.servet.entity.Student;

public interface StudentService {
	//List
	List<Student> getAllStudents();//Listeleme
	
	//Save
	Student saveStudent(Student student); //Kaydetme
	
	//---Update
    Student getStudentById(Long id) ; //Update 
	Student updateStudent(Student student);//Güncelleme 
	
	//--Delete
	void deleteStudentById(Long id);//Silme
	
}
