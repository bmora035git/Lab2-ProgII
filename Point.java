// Lab 2 - Programming II
// Point Class
// CSCI 1437
// Benjamin O. Morales
// Due:  9/21/2026 

// Point class that contains x and y coordinates.  
// The Point class should contain getter and setter 
// methods for the x and y coordinates.

public class Point {
    // Instance variables for x and y coordinates
    private double xCoordinate = 0;
    private double yCoordinate = 0;

    // Constructor for Point class with x and y coordinates
    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    // create deep copy of the point object
    public Point(Point pointDeepCopy) {
        this.xCoordinate = pointDeepCopy.getXCoordinate();
        this.yCoordinate = pointDeepCopy.getYCoordinate();
    }

    // Setter for x and y coordinates
    public void setXCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setYCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }


    // Getter for x-coordinate
    public double getXCoordinate() {
        return this.xCoordinate;
    }

    // Getter for y-coordinate
    public double getYCoordinate() {
        return this.yCoordinate;
    }    



}
