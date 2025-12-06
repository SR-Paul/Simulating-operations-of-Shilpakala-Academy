package com.example.oop.ModelClasses;

public class feedback {
    private String feedbackid;
    private String Rating;
    private String comment;
    private String Course;
    private Student student;

    public feedback(String course, String feedbackid, String rating, String comment, Student student) {
        Course = course;
        this.feedbackid = feedbackid;
        Rating = rating;
        this.comment = comment;
        this.student = student;
    }

    public String getFeedbackid() {
        return feedbackid;
    }

    public void setFeedbackid(String feedbackid) {
        this.feedbackid = feedbackid;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "feedback{" +
                "feedbackid='" + feedbackid + '\'' +
                ", Rating='" + Rating + '\'' +
                ", comment='" + comment + '\'' +
                ", Course='" + Course + '\'' +
                ", student=" + student +
                '}';
    }
}
