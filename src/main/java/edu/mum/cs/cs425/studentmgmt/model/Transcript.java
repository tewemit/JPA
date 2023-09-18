package edu.mum.cs.cs425.studentmgmt.model;
@Entity
public class Transcript {
    @Id
    long transcriptId;

    long studentId;
    String degreeTitle;

    public Transcript(long transcriptId, String degreeTitle, long studentId) {
        this.transcriptId = transcriptId;
        this.degreeTitle = degreeTitle;
        this.studentId = studentId;
    }

    public long getTranscriptId() {
        return transcriptId;
    }

    public void setTranscriptId(long transcriptId) {
        this.transcriptId = transcriptId;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }
}
