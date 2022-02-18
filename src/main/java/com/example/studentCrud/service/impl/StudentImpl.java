package com.example.studentCrud.service.impl;

import com.example.studentCrud.dto.StudentDto;
import com.example.studentCrud.entity.Lesson;
import com.example.studentCrud.entity.Student;
import com.example.studentCrud.repo.LessonRepository;
import com.example.studentCrud.repo.StudentRepository;
import com.example.studentCrud.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor//constr inj için dolu bir constr oluşturuyor
public class StudentImpl implements StudentService {
    private final StudentRepository studentRepo;
private final LessonRepository lessonRepository;

    @Override
    public StudentDto save(StudentDto studentDto) {
        Student student=new Student();

        student.setAd(studentDto.getAdi());
        student.setSoyad(studentDto.getSoyadi());

        final Student studentDb = (Student) studentRepo.save(student);
        List<Lesson> liste=new ArrayList<>();
        studentDto.getDersler().forEach(item->{
            Lesson lesson = new Lesson();
            lesson.setLesson(item);
            lesson.setDersAdi("ders 1");
            lesson.setStudent((List<Student>) studentDb);
            liste.add(lesson);
        });
        lessonRepository.saveAll(liste);
        studentDto.setId(studentDb.getId());

        return studentDto;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public StudentDto getById(Long id) {
        return null;
    }

    @Override
    public List<StudentDto> getAll() {
        return null;
    }
}
