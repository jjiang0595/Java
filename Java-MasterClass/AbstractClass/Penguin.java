package AbstractClass;

public class Penguin extends AbstractClass.Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Penguin doesn't fly");
    }
}