package com.Applicant.repository.ManyToManyRepo;

import com.Applicant.ManyToManyEntity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepo extends CrudRepository<Student,Long> {
}
