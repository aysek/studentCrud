package com.example.studentCrud.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="kisi")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of={"id"})
@ToString
public class Student{

    @Id
    @SequenceGenerator(name="seq_student",allocationSize = 1)
    @GeneratedValue(generator = "seq_student",strategy = GenerationType.SEQUENCE) //id fieldı üretilirken  GeneratedValue ile yaratıyoruz
    private Long id;

    @Column(length = 50,name = "ad")
    private String ad;

    @Column(length = 50,name = "soyad")
    private String soyad;

    //Join işlemi
    @OneToMany //bir öğrenciyi birçok derse atayabiliriz
    @JoinColumn(name = "student_lesson_id")
    private List<Lesson> dersler;



}
