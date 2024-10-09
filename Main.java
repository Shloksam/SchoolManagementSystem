package com.school;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem sms = new SchoolManagementSystem();

        // Create subjects
        Subject math = new Subject(1, "Mathematics");
        Subject science = new Subject(2, "Science");

        // Create classes (standards)
        Standard class1 = new Standard(1, 30);
        Standard class2 = new Standard(2, 25);

        // Create teachers
        Teacher teacher1 = new Teacher(1, "Mr. Dilip");
        Teacher teacher2 = new Teacher(2, "Mr. Aniket");

        // Admit students
        Student student1 = new Student(1, "Ankit Sharma", 101, class1);
        Student student2 = new Student(2, "Jay Koli", 102, class2);
        sms.admitStudent(student1);
        sms.admitStudent(student2);

        // Add teachers
        sms.addTeacher(teacher1);
        sms.addTeacher(teacher2);

        // Assign teachers to classes and subjects
        sms.assignTeacher(class1, teacher1, math);
        sms.assignTeacher(class2, teacher2, science);

        // Get total number of students in the school
        System.out.println("Total Students: " + sms.getTotalStudents());

        // Print all teachers
        for (Teacher teacher : sms.getAllTeachers()) {
            System.out.println(teacher.getName());
        }
        
        System.out.println("Total Students in class " + class1.getClassNo()+ ": "+  Standard.numberofStudentsInClass(class1));
        System.out.println("Seats Available in class " + class2.getClassNo()+": "+ Standard.seatsAvailable(class1));
    
        int studentsUnderTeacher1 = sms.getNumberOfStudentsUnderTeacher(teacher1);
        System.out.println(teacher1.getName() + " has " + studentsUnderTeacher1 + " students.");
    }
}
