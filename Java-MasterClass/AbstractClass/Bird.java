package AbstractClass;

public abstract class Bird extends AbstractClass.Animal implements AbstractClass.CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Bird breathing");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}