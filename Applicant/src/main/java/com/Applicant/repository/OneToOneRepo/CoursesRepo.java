package com.Applicant.repository.OneToOneRepo;

import com.Applicant.OneToOneEntity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CoursesRepo extends CrudRepository<Courses,Long> {
}
