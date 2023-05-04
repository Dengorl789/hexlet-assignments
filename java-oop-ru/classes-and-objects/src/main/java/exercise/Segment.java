package exercise;

// BEGIN
public class Segment {
    private Point point1;
    private Point point2;

    public Segment(Point point1, Point point2) {
        this.point1 = new Point(getBeginPoint().x, getBeginPoint().y);
        this.point2 = new Point(getEndPoint().x, getEndPoint().y);
    }
    public Point getBeginPoint() {
        return point1;
    }
    public Point getEndPoint() {
        return point2;
    }
    public Point getMidPoint() {
        int midX = (getBeginPoint().x + getEndPoint().x) / 2;
        int midY = (getBeginPoint().y + getEndPoint().y) / 2;
        return new Point(midX, midY);
    }
}
// END
