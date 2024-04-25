package classes.employee;

import classes.person.Person;

import java.time.LocalDate;

public class Employee extends Person {
    private String office;
    private double salary;
    private LocalDate dateHired;

    public Employee(String office, double salary, LocalDate dateHired) {
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, LocalDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee() {
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
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
    }

    @Override
    public String toString() {
        return "Class name: " + getClass().getName() + ", Person name: " + super.getName();
    }
}
