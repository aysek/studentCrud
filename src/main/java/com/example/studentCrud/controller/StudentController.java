package com.example.studentCrud.controller;

import com.example.studentCrud.dto.StudentDto;
import com.example.studentCrud.service.StudentService;
import com.example.studentCrud.service.impl.StudentImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    private final StudentImpl studentImpl;

    @PostMapping
    public ResponseEntity<StudentDto> kaydet(@RequestBody StudentDto studentDto){
        return ResponseEntity.ok(studentService.save(studentDto));
    }

}
