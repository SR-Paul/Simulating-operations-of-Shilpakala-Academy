package com.example.oop.ModelClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class classschedule {
    private String coursename;
    private LocalDateTime time;
    private String room;
    private Integer enrollcount;

    public classschedule(String coursename, LocalDateTime time, String room, Integer enrollcount) {
        this.coursename = coursename;
        this.time = time;
        this.room = room;
        this.enrollcount = enrollcount;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Integer getEnrollcount() {
        return enrollcount;
    }

    public void setEnrollcount(Integer enrollcount) {
        this.enrollcount = enrollcount;
    }

    @Override
    public String toString() {
        return "classschedule{" +
                "coursename='" + coursename + '\'' +
                ", time=" + time +
                ", room='" + room + '\'' +
                ", enrollcount=" + enrollcount +
                '}';
    }
}
