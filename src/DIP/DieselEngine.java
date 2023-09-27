package DIP;

public class DieselEngine implements iEngine {

    @Override
    public void startEngine() {
        System.out.println("Дизельный мотор заведен");

    }

    @Override
    public void stopEngine() {
        System.out.println("Дизельный мотор погашен");

    }

}
