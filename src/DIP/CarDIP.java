package DIP;

import javax.xml.crypto.Data;

public class CarDIP {
    private int maxSpeed;
    private iEngine engineType;

    public CarDIP(int maxSpeed, iEngine engineType) {
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }

    public void start() {
        engineType.startEngine();
    }

    public void stop() {
        engineType.stopEngine();
    }

}
