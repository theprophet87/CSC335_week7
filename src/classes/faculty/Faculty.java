package classes.faculty;

import classes.employee.Employee;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        if(c.size() < 2){
            throw new RuntimeException("Faculty MUST teach more than 2 courses");
        } else if (c.size() > 6) {
            throw new RuntimeException("Faculty must teach NO MORE than 6 courses");
        } else if (checkForDuplicateCourses(c)){
            throw new RuntimeException("Faculty CANNOT teach the same course more than once.");
        }
    }



    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void printDetails(){
        System.out.println("Faculty Name: " + getName());
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

    private boolean checkForDuplicateCourses(List<String> courses){
        Map<String, Integer> frequencyMap = new HashMap<>();
        for(String c : courses){
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            if(frequencyMap.get(c) > 1){
                return true;
            }
        }
        return false;
    }
}
