package com.Applicant.OneToOneEntity;



import javax.persistence.*;


@Entity
@Table(name="course_OneToOne")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String subject;

    @OneToOne(mappedBy = "courses")
    public Students student;

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

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


    public Courses() {}

    public Courses(String subject) {
        this.subject = subject;
    }

}
