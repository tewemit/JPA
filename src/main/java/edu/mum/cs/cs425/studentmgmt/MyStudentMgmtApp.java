package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;

public class MyStudentMgmtApp {
    public static void main(String[] args) {
        Student student = new Student(1,"123","firstName",
                "middleName","lastName",3.4, "2023-10-12");

        Transcript transcript = new Transcript (1, "BS Computer Science",1);
        Classroom classroom = new Classroom(1, "McLaughlin building", "M105");
        student.setClassroom(classroom);
        StudentMgmtApp studentMgmtApp = new StudentMgmtApp();
        studentMgmtApp.saveStudent(student);
        studentMgmtApp.addTransctipt(transcript);
    }

}
