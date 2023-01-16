package Master.Challenge;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Multigrain");
    }

    public void addHealthyAddition1 (String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2 (String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        return hamburgerPrice + (healthyExtra1Name != null ? healthyExtra1Price : 0.0) + (healthyExtra2Name != null ? healthyExtra2Price : 0.0);
    }
}