package com.example.studentCrud.repo;



import com.example.studentCrud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student,Long> {




}
