package com.example.studentCrud.entity;

import lombok.*;
import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(of={"id"})
@AllArgsConstructor
@NoArgsConstructor
@Table
@ToString
public class Lesson implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_student_lesson",allocationSize = 1)
    @GeneratedValue
    private Long id;

    @Column(length = 50,name = "dersAdi")
    private String dersAdi;

    @ManyToMany
    @JoinColumn(name = "student_lesson_id")
    private List<Student> student;

}
