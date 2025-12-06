package com.example.oop.ModelClasses;

import java.time.LocalDateTime;

public class evaluation {
    private int mark;
    private String submissionId;
    private LocalDateTime submissiontime;
    private String studentname;
    private String feedback;

    public evaluation(int mark, String submissionId, LocalDateTime submissiontime, String studentname, String feedback) {
        this.mark = mark;
        this.submissionId = submissionId;
        this.submissiontime = submissiontime;
        this.studentname = studentname;
        this.feedback = feedback;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public LocalDateTime getSubmissiontime() {
        return submissiontime;
    }

    public void setSubmissiontime(LocalDateTime submissiontime) {
        this.submissiontime = submissiontime;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "evaluation{" +
                "mark=" + mark +
                ", submissionId='" + submissionId + '\'' +
                ", submissiontime=" + submissiontime +
                ", studentname='" + studentname + '\'' +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
