import java.util.*;
class Account {
    int accNo;
    double balance;
    ArrayList<String> history = new ArrayList<>();
    Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
    void deposit(double amt) {
        balance += amt;
        history.add("Deposited: " + amt);
        System.out.println("Deposited!");
    }
    void withdraw(double amt) {
        if (amt > balance) {
            System.out.println("Not enough balance!");
        } else {
            balance -= amt;
            history.add("Withdrawn: " + amt);
            System.out.println("Withdrawn!");
        }
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }

    void showHistory() {
        System.out.println("Transactions:");
        for (String h : history) {
            System.out.println(h);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account user = new Account(101, 1000);

        int choice;
        do {
            System.out.println("\n1.Balance  2.Deposit  3.Withdraw  4.History  5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    user.showBalance();
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    user.deposit(sc.nextDouble());
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    user.withdraw(sc.nextDouble());
                    break;

                case 4:
                    user.showHistory();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        sc.close();
    }
}
