package edu.mum.cs.cs425.studentmgmt.repo;

import edu.mum.cs.cs425.studentmgmt.StudentMgmtApp;
import edu.mum.cs.cs425.studentmgmt.model.Student;

import java.util.List;

public class StudentRepoImpl implements StudentRepo {
    @Override
    public List<Student> findById(long id) {
        return null ;
    }

    @Override
    public List<Student> findByFirstName(String firstName) {
        return null;
    }

}
