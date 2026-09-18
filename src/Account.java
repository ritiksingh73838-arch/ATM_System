public class Account {
    private String accountNumber;
    private String pin;
    private double balance;

    public Account(String pin, String accountNumber,
                   double initialBalance) {
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public boolean validatePin(String enteredPin){
        return this.pin.equals(enteredPin);
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("whihdrawal successful! Remaining Balance: "+balance);
        }else{
            System.out.println("Invalid amount!");
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("withdrawal successful! Remaining Balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount!");
            return false;
        }
    }
}
