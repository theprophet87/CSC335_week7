package classes.staff;

import enums.Titles;

import java.time.LocalDate;

public class testStaff {
    public static void main(String[] args){
        Staff testStaff = new Staff("Johann Sebastian Bach", "999 Bach Dr", "4089872345", "jsb888@gmail.com",
                "Room 398", 80000.00, LocalDate.of(1650, 8, 23), Titles.EDUCATION_COORDINATOR);

        //toString method
        System.out.println(testStaff);

        //print full details
        testStaff.printDetails();

        //Test default object
        Staff defaultStaff = new Staff();
        defaultStaff.printDetails();
    }
}
