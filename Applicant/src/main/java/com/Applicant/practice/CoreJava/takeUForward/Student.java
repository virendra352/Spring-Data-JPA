package com.Applicant.practice.CoreJava.takeUForward;

import java.util.List;

public class Student {
    int ID;
    String Name;
    List<String> address;

    public Student(int ID, String name, List<String> address) {
        this.ID = ID;
        Name = name;
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", address=" + address +
                '}';
    }
}
