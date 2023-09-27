package ISP;

public class Shape3DSphere implements iShape3D {

    public double radius;

    public Shape3DSphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {

        return (4 / 3) * Math.PI * (radius * radius * radius);

    }

    @Override
    public double surfaceArea() {

        return 4 * Math.PI * (radius * radius);
    }

}
