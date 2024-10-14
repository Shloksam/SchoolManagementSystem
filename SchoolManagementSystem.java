package com.school;

import java.util.ArrayList;
import java.util.List;

//This is Utility Class
public class SchoolManagementSystem{
    private List<Student> students;
    private List<Teacher> teachers;
//    private List<Standard> standards;

    public SchoolManagementSystem() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
//        standards = new ArrayList<>();
    }

    // Admission process: Add student
    public void admitStudent(Student student) {
        Standard standard = student.getStandard();
        if (standard.addStudent(student)) {
            students.add(student);
            System.out.println(student.getName() + " has been admitted to Class " + standard.getClassNo());
        }
    }

    // Add teacher to the system
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        System.out.println(teacher.getName() + " has been added to the teacher roster.");
    }

    // Assign teacher to a class and subject
    public void assignTeacher(Standard standard, Teacher teacher, Subject subject) {
        ClassTeacher classTeacher = new ClassTeacher(standard, teacher, subject);
        teacher.assignClass(classTeacher);
        System.out.println(teacher.getName() + " has been assigned to teach " + subject.getName() + " in Class " + standard.getClassNo());
    }
    
    public int getNumberOfStudentsUnderTeacher(Teacher teacher) {
        int studentCount = 0;
        
        // Loop through each class the teacher teaches
        for (ClassTeacher classTeacher : teacher.getClassesTaught()) {
            // Get the list of students in the class
            Standard standard = classTeacher.getStandard();
            studentCount += standard.getStudents().size();
        }

        return studentCount;
    }

    // Get total number of students in the school
    public int getTotalStudents() {
        return students.size();
    }

    // Get all teachers in the school
    public List<Teacher> getAllTeachers() {
        return teachers;
    }
}
