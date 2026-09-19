// Lab 2 - Programming II
// Line Class
// CSCI 1437
// Benjamin O. Morales
// Due:  9/21/2026 

// Create Line class that contains a start point and an end point. 
// The Line class should contain a method to calculate the
// length of the line.  The Line class should also contain a method to 
// return a deep copy of the end point.

public class LineTester {
  // Main method to test the Line and Point classes
  public static void main(String[] args) {

  // Create a start point and an end point
    Point startPoint = new Point(0, 0);
    Point endPoint = new Point(3, 4);

    // Create a line using the start and end points
    Line line = new Line(startPoint, endPoint);

    // Length of the line should be 5
    System.out.println("The length of the line is " + line.getLength());
    endPoint.setXCoordinate(10);

    // Length of the line should be 5
    System.out.println("The length of the line is " + line.getLength());

    // Create a deep copy of the end point
    Point endPoint2 = line.getEndPoint(endPoint);
    endPoint2.setXCoordinate(10);

    // Length of the line should be 5
    System.out.println("The length of the line is " + line.getLength());
  }
}