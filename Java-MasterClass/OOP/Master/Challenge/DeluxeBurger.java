package Master.Challenge;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("DeluxeBurger", "Eggs and Bacon", 13.5, "White");
        super.addHamburgerAddition1("Chips", 2.8);
        super.addHamburgerAddition2("Drink", 2.8);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {

    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
    }
}