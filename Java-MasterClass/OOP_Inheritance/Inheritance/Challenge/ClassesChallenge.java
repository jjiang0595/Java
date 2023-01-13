package Bank;

import Inheritance.Challenge.Bank;

public class ClassesChallenge {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.withdrawFunds(0);
        bank.depositFunds(10000);
        System.out.println(bank.getAccountBalance());
    }
}