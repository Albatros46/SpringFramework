package com.servet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.servet.entity.Student;
import com.servet.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
	/*	// 
		Student stundet1=new Student("Akif", "AKCADAG", "marasliaslan46@gmail.com");
		studentRepository.save(stundet1);
		Student stundet2=new Student("Servet", "AKCADAG", "albatross220@windowslive.com");
		studentRepository.save(stundet2);
		Student stundet3=new Student("Ali", "YILDIZ", "yildizlar@gmail.com");
		studentRepository.save(stundet3);
		Student stundet4=new Student("Salih", "GULTEKIN", "gultekin@gmail.com");
		studentRepository.save(stundet4);
		//-----------------------------------------
		Student stundet5=new Student("Mesut", "GULTEKIN", "mest@gmail.com");
		studentRepository.save(stundet5);
		Student stundet6=new Student("Turgut", "TON", "tonton@windowslive.com");
		studentRepository.save(stundet6);
		Student stundet7=new Student("Ahmet", "KOZAK", "kozaklar@gmail.com");
		studentRepository.save(stundet7);
		Student stundet8=new Student("Scott", "ADKINS", "scott@gmail.com");
		studentRepository.save(stundet8);
	*/
	}

}
