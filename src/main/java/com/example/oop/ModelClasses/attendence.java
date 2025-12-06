package com.example.oop.ModelClasses;

import java.time.LocalDate;

public class attendence {
    private String courseId;
    private String studentid;
    private LocalDate date;
    private String status;

    public attendence(String courseId, String studentid, LocalDate date, String status) {
        this.courseId = courseId;
        this.studentid = studentid;
        this.date = date;
        this.status = status;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "attendence{" +
                "courseId='" + courseId + '\'' +
                ", studentid='" + studentid + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
