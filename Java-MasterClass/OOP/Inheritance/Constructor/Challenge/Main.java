package Constructor.Challenge;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Jerry", 1000, "jerry@email.com");
        Customer secondCustomer = new Customer("test", "test@email.com");
        Customer thirdCustomer = new Customer();
    }
}
