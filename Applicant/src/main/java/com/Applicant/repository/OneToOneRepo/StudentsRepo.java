package com.Applicant.repository.OneToOneRepo;

import com.Applicant.OneToOneEntity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StudentsRepo extends CrudRepository<Students,Long> {
}
