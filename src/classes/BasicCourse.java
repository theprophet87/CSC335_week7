package classes;

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
    public void addStudent(Student student) {
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
        System.out.println("Faculty Details: " + faculty.toString());

        System.out.println("Students Details: ");
        for(Student s : students){
            System.out.println(s.toString());
        }

        System.out.println("Staff Details: ");
        for(Staff s : staffList){
            System.out.println(s.toString());
        }
    }
}
