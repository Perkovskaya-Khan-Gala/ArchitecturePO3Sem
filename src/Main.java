import javax.sound.sampled.SourceDataLine;

import DIP.CarDIP;
import DIP.DieselEngine;
import DIP.PetrolEngine;
import DIP.iEngine;
import ISP.Shape2DCircle;
import ISP.Shape2DTriangle;
import ISP.Shape3DPyramid;
import ISP.Shape3DSphere;
import ISP.iShape2D;
import ISP.iShape3D;
import OCP.Bus;
import OCP.Car;
import OCP.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Площадь круга:");
        iShape2D circle = new Shape2DCircle(25);
        System.out.println(circle.area());
        System.out.println("Площадь треугольника:");
        iShape2D triangle = new Shape2DTriangle(15, 13);
        System.out.println(triangle.area());
        System.out.println("Объем сферы");
        iShape3D sphere = new Shape3DSphere(1);
        System.out.println(sphere.volume());
        System.out.println("Площадь поверхности сферы");
        System.out.println(sphere.surfaceArea());
        iShape3D pyramid = new Shape3DPyramid(1, 1, 1);
        System.out.println("Объем пирамиды");
        System.out.println(pyramid.volume());
        System.out.println("Площадь поверхности пирамиды");
        System.out.println(pyramid.surfaceArea());

        iEngine engine1 = new DieselEngine();
        CarDIP car1 = new CarDIP(180, engine1);
        car1.start();
        car1.stop();

        iEngine engine2 = new PetrolEngine();
        CarDIP car2 = new CarDIP(180, engine2);
        car2.start();
        car2.stop();

    }

    public static void mainOcp() {
        Vehicle car = new Car(123);
        car.calculateAllowedSpeed();
        Vehicle bus = new Bus(60);

    }

}