package com.example.studentCrud.service;

import com.example.studentCrud.dto.StudentDto;

import java.util.List;

public interface StudentService {
    StudentDto save(StudentDto studentDto);
    Boolean delete(Long id);
    StudentDto getById(Long id);
    List<StudentDto> getAll();
}
