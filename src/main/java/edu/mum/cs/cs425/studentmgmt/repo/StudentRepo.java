package edu.mum.cs.cs425.studentmgmt.repo;

import java.util.List;

import edu.mum.cs.cs425.studentmgmt.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
    List<Student> findById(long id);
    List<Student> findByFirstName(String firstName);
}
