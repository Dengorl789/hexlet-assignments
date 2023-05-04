package exercise;

// BEGIN
public class Cottage implements Home{
    private double area;
    private int floorCount;

    public int compareTo(Home home) {
        double thisHomeArea = getArea();
        double otherHomeArea = home.getArea();
        return thisHomeArea > otherHomeArea ? 1 : -1;
    }
    public String toString() {
        return getFloorCount() + " этажный коттедж площадью " + getArea() + " метров";
    }
    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }
    public void setArea() {
        this.area = area;
    }
    public double getArea() {
        return area;
    }
    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }
    public Cottage() {

    }

}
// END
