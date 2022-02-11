package com.example.studentCrud.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudentDto {
    private Long id;
    private String adi;
    private String soyadi;
    private List<String> dersler;
}
