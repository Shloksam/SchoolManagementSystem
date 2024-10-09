package com.school;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private int teacherId;
    private String name;
    private List<ClassTeacher> classesTaught;

    public Teacher(int teacherId, String name) {
        this.teacherId = teacherId;
        this.name = name;
        this.classesTaught = new ArrayList<>();
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public List<ClassTeacher> getClassesTaught() {
        return classesTaught;
    }

    public void assignClass(ClassTeacher classTeacher) {
        classesTaught.add(classTeacher);
    }
}
