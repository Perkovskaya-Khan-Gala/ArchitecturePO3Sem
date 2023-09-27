package DIP;

public class PetrolEngine implements iEngine {

    @Override
    public void startEngine() {
        System.out.println("Бензиновый мотор заведен");

    }

    @Override
    public void stopEngine() {
        System.out.println("Бензиновый мотор погашен");

    }

}
