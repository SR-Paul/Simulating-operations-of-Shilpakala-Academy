package com.example.oop.ModelClasses;

public class course {
    private String courseId;
    private String coursename;
    private String room;
    private int availableseat;
    private String instructorname;


    public course(String courseId, String coursename, String room, int availableseat, String instructorname) {
        this.courseId = courseId;
        this.coursename = coursename;
        this.room = room;
        this.availableseat = availableseat;
        this.instructorname = instructorname;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getAvailableseat() {
        return availableseat;
    }

    public void setAvailableseat(int availableseat) {
        this.availableseat = availableseat;
    }

    public String getInstructorname() {
        return instructorname;
    }

    public void setInstructorname(String instructorname) {
        this.instructorname = instructorname;
    }

    @Override
    public String toString() {
        return "course{" +
                "courseId='" + courseId + '\'' +
                ", coursename='" + coursename + '\'' +
                ", room='" + room + '\'' +
                ", availableseat=" + availableseat +
                ", instructorname='" + instructorname + '\'' +
                '}';
    }
}
