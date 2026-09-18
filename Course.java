// In Class 2 - Programming II
// Course Class
// CSCI 1437
// Benjamin O. Morales
// Due:  9/21/2026 

/*

To practice referencing, and relationship concepts, consider a course and faculty member,
who teaches a course.  The Faculty Class contains a name and
office hours of a faculty member.  The Course class contains the faculty 
member who teaches the course.


*/

public class Course extends Faculty {
    
   
    public Course(Faculty faculty) {
        super(faculty.getName(), faculty.getOfficeHours());
        this.faculty = faculty;
    }

    // Getter for course name
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Faculty getFaculty() {
        return faculty;
    }
    
    // Method to display course information
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Taught by: " + facultyMember.getName());
        System.out.println("Office Hours: " + facultyMember.getOfficeHours());
    }
}