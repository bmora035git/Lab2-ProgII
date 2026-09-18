public class Line {
    private Point startPoint;
    private Point endPoint;

    // Constructor
    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
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
