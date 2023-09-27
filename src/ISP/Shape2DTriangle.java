package ISP;

public class Shape2DTriangle implements iShape2D {
    public double height;
    public double base;

    @Override
    public double area() {
        return height * base / 2;
    }

    public Shape2DTriangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

}
