package classes.employee;

import java.time.LocalDate;

public class testEmployee {
    public static void main(String[] args){
        Employee testEmployee = new Employee("Rafael Nadal", "888 Juventud Rd", "9873459834", "ranada85@gmail.com", "Room 103", 70000.00,
                LocalDate.of(2012,8,12));

        System.out.println(testEmployee);
    }
}
