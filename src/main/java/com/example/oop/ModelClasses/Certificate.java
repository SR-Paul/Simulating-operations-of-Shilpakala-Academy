package com.example.oop.ModelClasses;

public class Certificate {
    private String certificateId;
    private String coursename;
    private String certificatestatus;

    public Certificate(String certificateId, String coursename, String certificatestatus) {
        this.certificateId = certificateId;
        this.coursename = coursename;
        this.certificatestatus = certificatestatus;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCertificatestatus() {
        return certificatestatus;
    }

    public void setCertificatestatus(String certificatestatus) {
        this.certificatestatus = certificatestatus;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "certificateId='" + certificateId + '\'' +
                ", coursename='" + coursename + '\'' +
                ", certificatestatus='" + certificatestatus + '\'' +
                '}';
    }
}
