import java.util.Scanner;

public class ATMApplication {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account userAccount = new Account("1234",
                "12345678",5000.0);
        System.out.println("=== ATM SYSTEM ===");
        System.out.println("Enter PIN: ");
        String enteredPin = scanner.nextLine();
        if (userAccount.validatePin(enteredPin)) {
            System.out.println("\nlogin Successful!");
            boolean exit = false;
            for (; ; ) {
                System.out.println("\n--- Select Option ---");
                System.out.println("1. check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. withdraw Money");
                System.out.println("4. Exit");
                System.out.println("Choice: ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Current Balance: "
                                + userAccount.getBalance());
                        break;
                    case 2:
                        System.out.println("enter amount to deposit: ");
                        double depAmount = scanner.nextDouble();
                        userAccount.deposit(depAmount);
                        break;
                    case 3:
                        System.out.println("Enter amount to withdraw: ");
                        double withAmount = scanner.nextDouble();
                        userAccount.withdraw(withAmount);
                        break;
                    case 4:
                        System.out.println("Thank you for using ATM System!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option! Try again.");
                }
            }
        }else {
            System.out.println("Incorrect PIN Access Denied.");
            }
        scanner.close();
        }
    }


