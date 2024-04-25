package classes;

import enums.Status;
import interfaces.Course;

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
    public String toString() {
        return "Class name: " + getClass().getName() + ", Person name: " + super.getName()
                + ", Address: " + super.getAddress() + ", Phone Number: " + super.getPhoneNumber()
                + ", Email: " + super.getEmail();
    }
}
