// In-Class 2 - Programming II
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

public class Faculty {
    
    private String name;
    private String officeHours;

    // Constructor
    public Faculty(String name, String officeHours) {
        this.name = name;
        this.officeHours = officeHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }
    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for office hours
    public String getOfficeHours() {
        return officeHours;
    }
}