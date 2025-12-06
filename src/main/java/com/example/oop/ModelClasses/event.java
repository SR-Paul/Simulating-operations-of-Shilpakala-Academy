package com.example.oop.ModelClasses;

import java.time.LocalDate;

public class event {
    private String event;
    private LocalDate eventtime;
    private String applicationid;
    private String StudentId;
    private String venue;

    public event(String event, LocalDate eventtime, String applicationid, String studentId, String venue) {
        this.event = event;
        this.eventtime = eventtime;
        this.applicationid = applicationid;
        StudentId = studentId;
        this.venue = venue;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public LocalDate getEventtime() {
        return eventtime;
    }

    public void setEventtime(LocalDate eventtime) {
        this.eventtime = eventtime;
    }

    public String getApplicationid() {
        return applicationid;
    }

    public void setApplicationid(String applicationid) {
        this.applicationid = applicationid;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "event{" +
                "event='" + event + '\'' +
                ", eventtime=" + eventtime +
                ", applicationid='" + applicationid + '\'' +
                ", StudentId='" + StudentId + '\'' +
                ", venue='" + venue + '\'' +
                '}';
    }
}
