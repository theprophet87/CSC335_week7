package classes.staff;

import java.time.LocalDate;

public class testStaff {
    public static void main(String[] args){
        Staff testStaff = new Staff("Johann Sebastian Bach", "999 Bach Dr", "4089872345", "jsb888@gmail.com",
                "Room 398", 80000.00, LocalDate.of(1650, 8, 23), "Education Coordinator");

        System.out.println(testStaff);
    }
}
