package exercise;

// BEGIN
public class Flat implements Home{
    private double area;
    private double balconyArea;
    private int floor;

    public double getArea() {
        return area + balconyArea;
    }
    public double getBalconyArea() {
        return balconyArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setArea() {
        this.area = area;
    }
    public void setBalconyArea() {
        this.balconyArea = balconyArea;
    }
    public void setFloor() {
        this.floor = floor;
    }
    public String toString() {
        return "Квартира площадью " + getArea() + " метров на " + getFloor() + " этаже";
    }
    public int compareTo(Home home) {
        double thisHomeArea = getArea();
        double otherHomeArea = home.getArea();
        return thisHomeArea > otherHomeArea ? 1 : -1;
    }
    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }
    public Flat() {

    }
}
// END
