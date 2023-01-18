package Autoboxing.Challenge;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}

public class Main {
    public static void main(String[] args) {
        Customer jerry = new Customer("Jerry", 500);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jerry", 500);
        bank.printStatement("Jerry");

    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer is not found.");
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println(customer + " has been added.");
        }
    }

    public void addTransaction(String customerName, double amount) {
        Customer customer = getCustomer(customerName);
        if (customer != null) {
            customer.transactions().add(amount);
        }

    }

    public void printStatement(String customerName) {
        Customer customer = getCustomer(customerName);
        if (customer != null) {
            System.out.println("--------------------------------");
            System.out.println("CUSTOMER NAME: " + customerName);
            System.out.println("CUSTOMER TRANSACTIONS: ");
            for (double d : customer.transactions()) {
                System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "Debit" : "Credit");
            }
            System.out.println("--------------------------------");
        }
    }
}