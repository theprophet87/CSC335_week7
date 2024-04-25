package classes.student;

import classes.person.Person;
import enums.Status;

public class Student extends Person {
    private Status status;

    public Student(Status status) {
        this.status = status;
    }

    public Student(String name, String address, String phoneNumber, String email, Status status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    public Student() {
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public void printDetails(){
        System.out.println("Student Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhoneNumber() );
        System.out.println("Email: " + getEmail());
        System.out.println("Status: " + getStatus().toString());
    }

    @Override
    public String toString() {
        return "Class name: " + getClass().getName() + ", Person name: " + super.getName();
    }
}
