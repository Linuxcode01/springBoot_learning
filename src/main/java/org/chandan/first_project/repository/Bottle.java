package org.chandan.first_project.repository;

import org.chandan.first_project.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bottle extends JpaRepository<Student, Integer> {

}
