package classes.person;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person(){};

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printDetails(){
        System.out.println("Person Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhoneNumber() );
        System.out.println("Email: " + getEmail());
    }

    @Override
    public String toString() {
        return "Class name: " + getClass().getName() + ", Person name: " + getName();
    }
}
