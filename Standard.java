package com.school;

import java.util.ArrayList;
import java.util.List;

public class Standard {
    private int classNo;
    private int capacity;
    private List<Student> students;

    public Standard(int classNo, int capacity) {
        this.classNo = classNo;
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public int getClassNo() {
        return classNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean addStudent(Student student) {
        if (students.size() < capacity) {
            students.add(student);
            return true;
        } else {
            System.out.println("Class is full!");
            return false;
        }
    }
    
    public static int numberofStudentsInClass(Standard std) {
    	return std.getStudents().size();
    }
    
    public static int seatsAvailable(Standard std) {
    	return std.getCapacity() - std.getStudents().size();
    }
}
