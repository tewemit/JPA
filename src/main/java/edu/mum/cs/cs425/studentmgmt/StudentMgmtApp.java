package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repo.StudentRepo;
import edu.mum.cs.cs425.studentmgmt.repo.StudentRepoImpl;
import edu.mum.cs.cs425.studentmgmt.repo.TranscriptRepo;
import edu.mum.cs.cs425.studentmgmt.repo.TranscriptRepoImpl;

public class StudentMgmtApp {
    private StudentRepo studentRepo = new StudentRepoImpl();
    private TranscriptRepo transcriptRepo = new TranscriptRepoImpl();
    public void saveStudent(Student student) {
        studentRepo.save(student);
    }
    public void addTransctipt(Transcript transcript){
        transcriptRepo.save(transcript);
    };


}
