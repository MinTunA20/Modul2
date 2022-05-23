public class Circle {
    double radian;
    String color;

    public Circle(double radian, String color) {
        this.radian = radian;
        this.color = color;
    }

    public double getRadian() {
        return radian;
    }

    public void setRadian(double radian) {
        this.radian = radian;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radian=" + radian +
                ", color='" + color + '\'' +
                '}';
    }
}
