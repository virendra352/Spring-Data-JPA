package com.Applicant.OneToManyEntity;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "department_oneToMany")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    // One Department has many Employees
    @OneToMany(mappedBy = "department",cascade =CascadeType.ALL,orphanRemoval = true)
    List<Employee> employeeList=new ArrayList<>();

    public Department() {
    }

    public Department(String name) {
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

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    /*public void addEmployee(Employee employee) {
        employee.setDepartment(this); // set reverse mapping
        this.employeeList.add(employee);
    }*/
}
