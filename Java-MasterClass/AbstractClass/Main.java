package AbstractClass;

public class Main {
    public static void main(String[] args) {
        AbstractClass.Dog dog = new AbstractClass.Dog("Yorkie");
        dog.breathe();
        dog.eat();

        AbstractClass.Parrot parrot = new AbstractClass.Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        AbstractClass.Penguin penguin = new AbstractClass.Penguin("Pen");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}