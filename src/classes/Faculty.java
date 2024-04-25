package classes;

import java.time.LocalDate;
import java.util.List;

public class Faculty extends Employee{
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
    public String toString() {

        return "Class name: " + getClass().getName() + ", Person name: " + super.getName()
                + ", Address: " + super.getAddress() + ", Phone Number: " + super.getPhoneNumber()
                + ", Email: " + super.getEmail();
    }
}
