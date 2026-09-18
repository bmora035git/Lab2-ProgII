public class Point {
    private double xCoordinate;
    private double yCoordinate;

// Constructor
    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

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
