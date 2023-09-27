package ISP;

public class Shape3DPyramid implements iShape3D {
    public double baseLength;
    public double baseWidth;
    public double pyramidHeight;

    public Shape3DPyramid(double baseLength, double baseWidth, double pyramidHeight) {
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidHeight;
    }

    @Override
    public double surfaceArea() {

        return (baseLength * baseWidth) + (baseLength * Math.sqrt(Math.pow(baseWidth / 2, 2) +
                Math.pow(pyramidHeight, 2)))
                + (baseWidth * Math.sqrt(Math.pow(baseLength / 2, 2) + Math.pow(pyramidHeight, 2)));
    }

    @Override
    public double volume() {

        return ((baseLength * baseWidth) * pyramidHeight) / 3;
    }

}
