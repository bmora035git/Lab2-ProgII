// Lab 2 - Programming II
// Line Class
// CSCI 1437
// Benjamin O. Morales
// Due:  9/21/2026 

// Create Line class that contains a start point and an end point. 
// The Line class should contain a method to calculate the 
// length of the line.  The Line class should also contain a method to 
// return a deep copy of the end point.

public class Line extends Point {

    // Instance variables for start and end points
    private Point startPoint = null;
    private Point endPoint = null;

    // Constructor for Line class with start and end points
    // the constructor creates a deep copy of the start and end points 
    // to ensure that the original points are not modified when the line is created.
    public Line(Point startPoint, Point endPoint) {
        super(startPoint.getXCoordinate(), startPoint.getYCoordinate());
        this.startPoint = new Point(startPoint);
        this.endPoint = new Point(endPoint);
    }

    // Getter and setter methods for start and end points
    // Setter for start point
    // deep copy of the point object is created to ensure 
    // that the original point is not modified when the line is created.
    
    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    // Getter for start point
    public Point getStartPoint(Point startPoint) {
        return this.startPoint;
    }

    public Point getEndPoint(Point endPoint) {
        return this.endPoint;
    }
// Method to calculate the length of the line using the distance formula
    // The length of the line is calculated using the distance formula,
    // which is the square root of the sum of the squares of the differences
    // of the x and y coordinates of the start and end points.
    public double getLength() {
        double deltaX = endPoint.getXCoordinate() - startPoint.getXCoordinate();
        double deltaY = endPoint.getYCoordinate() - startPoint.getYCoordinate();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
