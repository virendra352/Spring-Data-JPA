package com.Applicant.OneToOneEntity;


import javax.persistence.*;

@Entity
@Table(name="student_OneToOne")
public class Students {
    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "course_id")
    Courses courses;

    public Students() {
    }

    public Students(String name) {
        this.name = name;
    }

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

    public Courses getCourse() {
        return courses;
    }

    public void setCourse(Courses courses) {
        this.courses = courses;
    }
}
