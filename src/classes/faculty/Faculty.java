package classes.faculty;

import classes.employee.Employee;

import java.time.LocalDate;
import java.util.List;

public class Faculty extends Employee {
    private List<String> courses;
    private String course;

    public Faculty(){
    }

    public Faculty(List<String> c){
        this.courses = c;
    }

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, LocalDate dateHired, List<String> c){
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.courses = c;
    }



    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void printDetails(){
        System.out.println("Employee Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhoneNumber() );
        System.out.println("Email: " + getEmail());
        System.out.println("Office: " + getOffice());
        System.out.println("Salary: " + getSalary());
        System.out.println("Date Hired: " + getDateHired());
        for(String c : courses){
            System.out.println("Course: " + c);
        }
    }

    @Override
    public String toString() {

        return "Class name: " + getClass().getName() + ", Person name: " + super.getName();
    }
}
