package com.example.oop.ModelClasses;

public class Student extends User{
    private String major;
    private String enrollmentdate;

    public Student(String userID, String password, String username, String major, String enrollmentdate) {
        super(userID, password, username);
        this.major = major;
        this.enrollmentdate = enrollmentdate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEnrollmentdate() {
        return enrollmentdate;
    }

    public void setEnrollmentdate(String enrollmentdate) {
        this.enrollmentdate = enrollmentdate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                ", enrollmentdate='" + enrollmentdate + '\'' +
                '}';
    }
}
