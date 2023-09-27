package ISP;

public class Shape2DCircle implements iShape2D {
    public double radius;

    public Shape2DCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * getRadius();
    }

}
