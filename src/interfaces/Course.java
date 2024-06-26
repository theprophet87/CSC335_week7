package interfaces;

import classes.faculty.Faculty;
import classes.staff.Staff;
import classes.student.Student;

public interface Course {
    void enrollStudent(Student student);
    void assignFaculty(Faculty faculty);
    void assignStaff(Staff staff);
    void courseDetails();
}
