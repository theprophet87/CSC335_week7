import classes.faculty.Faculty;
import classes.staff.Staff;
import classes.student.Student;
import enums.Status;
import enums.Titles;
import interfaces.impl.BasicCourse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalTestProgram {
    public static void main(String [] args){

        Faculty faculty1 = new Faculty("Denzel Washington", "220 Bradford Ave", "3930298388", "dwash59@gmail.com", "Room 202", 80000, LocalDate.of(2003, 03, 21),Arrays.asList("CSC100", "CSC200"));
        Faculty faculty2 = new Faculty("Keanu Reeves", "3 Morpheus St", "3438780922", "kreeves2938@hotmail.com", "Room 103", 72000, LocalDate.of(2008, 10, 23), Arrays.asList( "CSC330", "CSC340"));
        Faculty faculty3 = new Faculty("Russell Crowe", "239 Gladiator Rd", "987387092", "rcrowe999@yahoo.com", "Room 329", 78000, LocalDate.of(2005,9,23),Arrays.asList("CSC335", "CSC200"));
        Faculty faculty4 = new Faculty("Cate Blanchett", "87 Loki Ave", "7778789999", "cblanchett888@hotmail.com", "Room 698", 76000, LocalDate.of(2005, 11, 2),Arrays.asList("CSC100", "CSC340"));
        Faculty faculty5 = new Faculty("Jane Fonda", "383 Monster Drive", "8880989890", "jfonda987@yahoo.com", "Room 105", 100000, LocalDate.of(1993, 7, 14), Arrays.asList( "CSC200", "CSC340"));
        Faculty faculty6 = new Faculty("Idris Elba", "350 Baltimore Ave", "4433220021", "ielba2083@gmail.com", "Room 201", 70000, LocalDate.of(2007, 8, 28),Arrays.asList("CSC330", "CSC200"));

        Staff staff1 = new Staff("Roger Federer", "88 Monte Carlo Drive", "888987938", "rfed088@gmail.com", "Room 102", 40000, LocalDate.of(2011, 1,12),Titles.EDUCATION_COORDINATOR);
        Staff staff2 = new Staff("Rafael Nadal", "273 Barcelona Ave", "853987272", "rnadal2000@yahoo.com", "Room 103", 42000, LocalDate.of(2010, 2, 23),Titles.REGISTRAR);
        Staff staff3 =  new Staff("Novak Djokovic", "102 Laver Ave #23", "8899831122", "djoker288@hotmail.com", "Room 104", 45000, LocalDate.of(2009, 3, 12), Titles.ASSISTANT);
        Staff staff4 = new Staff("Aryna Sabalenka", "488 Minsk Rd", "2325549988", "asaba37@gmail.com", "Room 108", 39000, LocalDate.of(2012,3,28));



        Student student1 = new Student("Bruce Leroy", "160 10th St", "2023459837", "bleroy564@gmail.com", Status.FRESHMAN);
        Student student2 = new Student("Tom Anderson", "500 Madison Ave", "2029837722", "ta187383@gmail.com", Status.SENIOR);
        Student student3 = new Student("Mario Mario", "2811 80th St", "5839882221", "mariomario988@gmail.com", Status.SOPHOMORE);
        Student student4 = new Student("Scott Summers", "53 Barstool St #2A", "4023034044", "ssummers8x84@gmail.com", Status.JUNIOR);


        BasicCourse course1 = new BasicCourse("CSC100");
        BasicCourse course2 = new BasicCourse("CSC200");
        BasicCourse course3 = new BasicCourse("CSC330");
        BasicCourse course4 = new BasicCourse("CSC340");
        BasicCourse course5 = new BasicCourse("CSC325");
        BasicCourse course6 = new BasicCourse("CSC335");

        //CSC100
        course1.enrollStudent(student1);
        course1.enrollStudent(student3);
        course1.assignFaculty(faculty1);
        course1.assignStaff(staff1);
        course1.assignStaff(staff2);
        course1.assignStaff(staff3);
        course1.assignStaff(staff4);


        //CSC200

        course2.enrollStudent(student2);
        course2.enrollStudent(student4);
        course2.assignFaculty(faculty2);
        course2.assignStaff(staff1);
        course2.assignStaff(staff2);
        course2.assignStaff(staff3);
        course2.assignStaff(staff4);

        //CSC330

        course3.enrollStudent(student1);
        course3.enrollStudent(student4);
        course3.assignFaculty(faculty3);
        course3.assignStaff(staff1);
        course3.assignStaff(staff2);
        course3.assignStaff(staff3);
        course3.assignStaff(staff4);

        //CSC34

        course4.enrollStudent(student3);
        course4.enrollStudent(student2);
        course4.assignFaculty(faculty4);
        course4.assignStaff(staff1);
        course4.assignStaff(staff2);
        course4.assignStaff(staff3);
        course4.assignStaff(staff4);

        //CSC324

        course5.enrollStudent(student2);
        course5.assignFaculty(faculty5);
        course5.assignStaff(staff1);
        course5.assignStaff(staff2);
        course5.assignStaff(staff3);
        course5.assignStaff(staff4);

        //CSC335

        course6.enrollStudent(student1);
        course6.enrollStudent(student3);
        course6.enrollStudent(student4);
        course6.assignFaculty(faculty6);
        course6.assignStaff(staff1);
        course6.assignStaff(staff2);
        course6.assignStaff(staff3);
        course6.assignStaff(staff4);

        //Add to list
        List<BasicCourse> courseList = new ArrayList<>(Arrays.asList(course1, course2, course3, course4, course5, course6));

        //Details
        printAllDetails(courseList);


    }

    public static void printAllDetails(List<BasicCourse> list){
        for(BasicCourse b : list){
            System.out.println("------------------");
            b.courseDetails();
            System.out.println("------------------");
        }
    }
}
