package com.example.oop.ModelClasses;

public class lessonmaterials {
    private String filename;
    private String materialId;
    private String coursename;

    public lessonmaterials(String filename, String materialId, String coursename) {
        this.filename = filename;
        this.materialId = materialId;
        this.coursename = coursename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    @Override
    public String toString() {
        return "lessonmaterials{" +
                "filename='" + filename + '\'' +
                ", materialId='" + materialId + '\'' +
                ", coursename='" + coursename + '\'' +
                '}';
    }
}
