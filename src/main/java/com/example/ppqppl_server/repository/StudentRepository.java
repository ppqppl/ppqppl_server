package com.example.ppqppl_server.repository;

import com.example.ppqppl_server.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {

}
