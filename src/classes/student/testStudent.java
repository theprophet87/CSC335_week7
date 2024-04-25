package classes.student;

import enums.Status;

public class testStudent {
    public static void main(String[] args){
        Student testStudent = new Student("Scottie Pippen", "333 Baller Ln", "2313982093", "spippen344@gmail", Status.SENIOR);

        System.out.println(testStudent);
    }
}
