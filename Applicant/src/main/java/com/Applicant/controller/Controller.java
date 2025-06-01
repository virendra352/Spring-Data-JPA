package com.Applicant.controller;

import com.Applicant.ManyToManyEntity.Student;
import com.Applicant.ManyToManyService.ManyToManyService;
import com.Applicant.OneToManyEntity.Department;
import com.Applicant.OneToManyEntity.Employee;
import com.Applicant.OneToOneEntity.Students;
import com.Applicant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class Controller {
    @Autowired
    public UserService userService;
    @Autowired
    ManyToManyService manyToManyService;

    @GetMapping("/testing")
    public String GetTestingMethod(){
        return "successfully tested !!!!.....";
    }
    @GetMapping("/send")
    public String UserMethod(){
        userService.createUserAndOrder();
        return "Success";
    }
    @PostMapping("/manyToMany")
    public String ManyToMany(@RequestBody Student student){
        manyToManyService.saveData(student);
        return  "successful";
    }

    @PostMapping("/oneToOne")
    public String oneToOneMethod(@RequestBody Students student){
        manyToManyService.saveOneToOne(student);
        return  "successful";
    }

    @PostMapping("/oneToMany")
    public String oneToManyMethod(@RequestBody Department department){
        for (Employee e : department.getEmployeeList()) {
            e.setDepartment(department);
        }
        manyToManyService.saveOneToMany(department);
        return  "successful";
    }


}
