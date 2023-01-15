package Polymorphism.Challenge;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }


    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }
    public void drive() {
        System.out.printf("Currently driving a " + getClass().getSimpleName());
        runEngine();
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }
    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("GAS");
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average %.2f %n", avgKmPerLitre);

    }
}

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("BEV");
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage exceeds the average %.2f %n", avgKmPerCharge);

    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("HYBRID");
    }

    @Override
    protected void runEngine() {
        System.out.printf("HYBRID -> usage exceeds the average %.2f %n", avgKmPerLitre);

    }
}
