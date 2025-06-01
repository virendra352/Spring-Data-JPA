package com.Applicant.ManyToManyEntity;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="student_table")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    List<Course> courseSet=new ArrayList<>();

    public List<Course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(List<Course> courseSet) {
        this.courseSet = courseSet;
    }

    public Student() {}

    public Student(String name) {
        this.name = name;
    }

}
