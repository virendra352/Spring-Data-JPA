package com.Applicant.repository.ManyToManyRepo;

import com.Applicant.ManyToManyEntity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface CourseRepo extends CrudRepository<Course,Long> {
}
