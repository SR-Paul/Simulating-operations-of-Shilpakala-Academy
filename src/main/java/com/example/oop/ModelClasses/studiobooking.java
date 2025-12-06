package com.example.oop.ModelClasses;

import java.time.LocalDateTime;

public class studiobooking {
    private String halltype;
    private String purpose;
    private LocalDateTime preferredtime;
    private String status;

    public studiobooking(String halltype, String purpose, LocalDateTime preferredtime, String status) {
        this.halltype = halltype;
        this.purpose = purpose;
        this.preferredtime = preferredtime;
        this.status = status;
    }

    public String getHalltype() {
        return halltype;
    }

    public void setHalltype(String halltype) {
        this.halltype = halltype;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public LocalDateTime getPreferredtime() {
        return preferredtime;
    }

    public void setPreferredtime(LocalDateTime preferredtime) {
        this.preferredtime = preferredtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "studiobooking{" +
                "halltype='" + halltype + '\'' +
                ", purpose='" + purpose + '\'' +
                ", preferredtime=" + preferredtime +
                ", status='" + status + '\'' +
                '}';
    }
}
