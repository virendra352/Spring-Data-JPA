package com.Applicant.practice.CoreJava.javaPractice;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    int marks;
    String subject;

    public Student(int marks, String subject) {
        this.marks = marks;
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return marks == student.marks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marks);
    }
    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", subject='" + subject + '\'' +
                '}';
    }
}
