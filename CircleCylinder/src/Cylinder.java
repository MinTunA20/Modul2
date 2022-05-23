public class Cylinder extends Circle {
    super(double radian, String color);
    double height;
    double volume = radian * radian * 3.14;

    public Cylinder(double height) {
        this.height = height;
        this.volume = height;
    }

}
