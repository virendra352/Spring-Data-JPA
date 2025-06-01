package com.Applicant.ManyToManyEntity;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="course_table")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String subject;
    @ManyToMany(mappedBy = "courseSet")
    List<Student> studentSet=new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(List<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public Course() {}

    public Course(String subject) {
        this.subject = subject;
    }

}
