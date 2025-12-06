package com.example.oop.ModelClasses;

public class instructor extends User{
    private String department;
    private String hiredate;

    public instructor(String userID, String password, String username, String department, String hiredate) {
        super(userID, password, username);
        this.department = department;
        this.hiredate = hiredate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "instructor{" +
                "department='" + department + '\'' +
                ", hiredate='" + hiredate + '\'' +
                '}';
    }
}
