package Classes.Challenge;

public class Bank {
    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void depositFunds(int amount) {
        this.accountBalance += amount;
        System.out.println("DEPOSITED " + amount + " DOLLARS");
    }

    public void withdrawFunds(int amount) {
        if (amount <= this.accountBalance) {
            this.accountBalance -= amount;
            System.out.println("WITHDREW " + amount + " DOLLARS");
        } else {
            System.out.println("YOU DO NOT HAVE SUFFICIENT FUNDS");
        }
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }



    public void describeBank () {
        System.out.println(accountNumber);
    }
}