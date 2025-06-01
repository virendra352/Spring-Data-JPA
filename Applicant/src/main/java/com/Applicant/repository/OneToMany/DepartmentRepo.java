package com.Applicant.repository.OneToMany;

import com.Applicant.OneToManyEntity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepo extends CrudRepository<Department,Long> {
}
