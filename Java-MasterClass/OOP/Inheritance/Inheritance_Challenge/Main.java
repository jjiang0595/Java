package Inheritance_Challenge;

public class Main {
    public static void main(String[] args) {
        Employee Jerry = new Employee("Jerry", "02/02/2002", "01/01/2020");
        System.out.println(Jerry);
        System.out.println("Age = " + Jerry.getAge());
        System.out.println("Pay = " + Jerry.collectPay());
    }

}
