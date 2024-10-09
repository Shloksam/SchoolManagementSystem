package com.school;

public class Student {
    private int studentId;
    private String name;
    private int rollNo;
    private Standard standard;

    public Student(int studentId, String name, int rollNo, Standard standard) {
        this.studentId = studentId;
        this.name = name;
        this.rollNo = rollNo;
        this.standard = standard;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public Standard getStandard() {
        return standard;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (Roll No: " + rollNo + ")";
    }
}
