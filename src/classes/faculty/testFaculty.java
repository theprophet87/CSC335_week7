package classes.faculty;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class testFaculty {
    public static void main(String[] args){
        Faculty testFaculty = new Faculty("Leonardo DiCaprio", "777 Beverly Hills Dr", "908888372", "ldicap283784@yahoo.com",
                "Room 452A", 90000, LocalDate.of(2003, 12, 3), Arrays.asList("CSC340", "CSC100"));

        //toString method
        System.out.println(testFaculty);

        //print full details
        testFaculty.printDetails();

    }
}
