package edu.mum.cs.cs425.studentmgmt.repo;

import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TranscriptRepo extends JpaRepository<Transcript, Long> {
    List<Student> findById(long id);
    List<Student> findStudentId(String firstName);
}
