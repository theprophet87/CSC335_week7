package interfaces.impl;

import classes.faculty.Faculty;
import classes.staff.Staff;
import classes.student.Student;
import interfaces.Course;

import java.util.ArrayList;
import java.util.List;

public class BasicCourse implements Course {
    private String courseName;
    private Student student;
    private Faculty faculty;
    private List<Student> students;
    private List<Staff> staffList;

    public BasicCourse(String courseName){
        this.courseName = courseName;
        this.students = new ArrayList<>();
        this.staffList = new ArrayList<>();
    }

    @Override
    public void enrollStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public void assignFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public void assignStaff(Staff staff) {
        this.staffList.add(staff);
    }

    @Override
    public void courseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Faculty Details: ");
        System.out.println("--------------------");
        faculty.printDetails();
        System.out.println();

        System.out.println("Students Details: ");
        System.out.println("--------------------");
        for(Student s : students){
            s.printDetails();
            System.out.println();
        }

        System.out.println("Staff Details: ");
        System.out.println("--------------------");
        for(Staff s : staffList){
            s.printDetails();
            System.out.println();

        }
    }
}
