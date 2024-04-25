package classes.staff;

import classes.employee.Employee;

import java.time.LocalDate;

public class Staff extends Employee {
    private String title;

    public Staff(){
        this.title = "Support Staff";
    }

    public Staff(String title){
        this.title = title;
    }

    public Staff(String office, double salary, LocalDate dateHired, String title) {
        super(office, salary, dateHired);
        this.title = title;
    }

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, LocalDate dateHired) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = "Support Staff";
    }
    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, LocalDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void printDetails() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Title: " + getTitle());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhoneNumber() );
        System.out.println("Email: " + getEmail());
        System.out.println("Office: " + getOffice());
        System.out.println("Salary: " + getSalary());
        System.out.println("Date Hired: " + getDateHired());
    }

    @Override
    public String toString() {
        return "Class name: " + getClass().getName() + ", Person name: " + super.getName();
    }
}
