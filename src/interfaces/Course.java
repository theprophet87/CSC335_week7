package interfaces;

import classes.Faculty;
import classes.Staff;
import classes.Student;

public interface Course {
    void addStudent(Student student);
    void assignFaculty(Faculty faculty);
    void assignStaff(Staff staff);
    void courseDetails();
}
