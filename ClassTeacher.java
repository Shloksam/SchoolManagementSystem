package com.school;

public class ClassTeacher {
    private Standard standard;
    private Teacher teacher;
    private Subject subject;

    public ClassTeacher(Standard standard, Teacher teacher, Subject subject) {
        this.standard = standard;
        this.teacher = teacher;
        this.subject = subject;
    }

    public Standard getStandard() {
        return standard;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Class: " + standard.getClassNo() + ", Teacher: " + teacher.getName() + ", Subject: " + subject.getName();
    }
}
