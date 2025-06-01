package com.Applicant.ManyToManyService;

import com.Applicant.ManyToManyEntity.Student;
import com.Applicant.OneToManyEntity.Department;
import com.Applicant.OneToOneEntity.Students;
import com.Applicant.repository.ManyToManyRepo.CourseRepo;
import com.Applicant.repository.ManyToManyRepo.StudentRepo;
import com.Applicant.repository.OneToMany.DepartmentRepo;
import com.Applicant.repository.OneToOneRepo.StudentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManyToManyService {
    @Autowired
    StudentRepo studentRepo;
    @Autowired
    StudentsRepo studentsRepo;
    @Autowired
    DepartmentRepo departmentRepo;
    @Autowired
    CourseRepo courseRepo;

    public void saveData(Student student) {
    studentRepo.save(student);

    }

    public void saveOneToOne(Students students) {
        studentsRepo.save(students);

    }

    public void saveOneToMany(Department department) {
        departmentRepo.save(department);
    }
}
