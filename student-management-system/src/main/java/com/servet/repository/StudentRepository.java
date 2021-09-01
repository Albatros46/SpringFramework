package com.servet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servet.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
