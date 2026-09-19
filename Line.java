public class Line extends Point {
    private Point startPoint = null;
    private Point endPoint = null;

    // Constructor
    public Line(Point startPoint, Point endPoint) {
        super(startPoint.getXCoordinate(), startPoint.getYCoordinate());
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    // create deep copy of the point object

    public Point(Point otherPoint) {
        
        this.startPoint = new Point(otherPoint.getStartPoint());
        this.endPoint = new Point(otherPoint.getEndPoint());

        
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    // Getter for start point
    public Point getStartPoint() {
        return this.startPoint;

    }

    public Point getEndPoint() {
        return this.endPoint;
    }

    public double getLength() {
        double deltaX = endPoint.getXCoordinate() - startPoint.getXCoordinate();
        double deltaY = endPoint.getYCoordinate() - startPoint.getYCoordinate();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
