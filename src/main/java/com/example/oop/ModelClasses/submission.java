package com.example.oop.ModelClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class submission {
    private String Submissionid;
    private String assignmenntid;
    private LocalDateTime submissiondate;
    private String filepath;

    public submission(String submissionid, String assignmenntid, LocalDateTime submissiondate, String filepath) {
        Submissionid = submissionid;
        this.assignmenntid = assignmenntid;
        this.submissiondate = submissiondate;
        this.filepath = filepath;
    }

    public String getSubmissionid() {
        return Submissionid;
    }

    public void setSubmissionid(String submissionid) {
        Submissionid = submissionid;
    }

    public String getAssignmenntid() {
        return assignmenntid;
    }

    public void setAssignmenntid(String assignmenntid) {
        this.assignmenntid = assignmenntid;
    }

    public LocalDateTime getSubmissiondate() {
        return submissiondate;
    }

    public void setSubmissiondate(LocalDateTime submissiondate) {
        this.submissiondate = submissiondate;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public String toString() {
        return "submission{" +
                "Submissionid='" + Submissionid + '\'' +
                ", assignmenntid='" + assignmenntid + '\'' +
                ", submissiondate=" + submissiondate +
                ", filepath='" + filepath + '\'' +
                '}';
    }
}
