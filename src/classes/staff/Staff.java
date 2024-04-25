package classes.staff;

import classes.employee.Employee;
import enums.Titles;

import java.time.LocalDate;

public class Staff extends Employee {
    private Titles title;

    public Staff(){
        this.title = Titles.SUPPORT_STAFF;
    }

    public Staff(Titles title){
        this.title = title;
    }

    public Staff(String office, double salary, LocalDate dateHired, Titles title) {
        super(office, salary, dateHired);
        this.title = title;
    }

    //Default title set to support staff
    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, LocalDate dateHired) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = Titles.SUPPORT_STAFF;
    }

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, LocalDate dateHired, Titles title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    public Titles getTitle() {
        return title;
    }

    public void setTitle(Titles title) {
        this.title = title;
    }

    @Override
    public void printDetails() {
        System.out.println("Staff Name: " + getName());
        System.out.println("Title: " + getTitle().toString());
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
