package Assign_1;

import java.util.Scanner;

public class Bank_Application {
    int AccountNo;
    double balance = 0;

    public Bank_Application(int AccountNo) {
        Scanner sc1 = new Scanner(System.in);

        do {
            System.out.println("Enter your name:");
            String name = sc1.nextLine();
            System.out.println("Enter your 10-digit Mobile Number:");
            String mobileNumberStr = sc1.nextLine();
            long mobileNumber;
            try {
                mobileNumber = Long.parseLong(mobileNumberStr);
            } catch (NumberFormatException e) {
                System.out.println("Invalid mobile number format. Please enter a 10-digit number.");
                continue;
            }
            System.out.println("You have successfully created your Bank account");
            System.out.println("Your Account details are as follows:");
            System.out.println("1) Name: " + name);
            System.out.println("2) Mobile Number: " + mobileNumber);
            System.out.println("3) Account Number: " + AccountNo);
            break;
        } while (true);
    }

    public synchronized void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Account has insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("You have successfully withdrawn amount Rs : " + amount);
            System.out.println("Your new account balance is Rs : " + balance);
        }
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("You have successfully deposited amount Rs : " + amount);
        System.out.println("Your new account balance is Rs : " + balance);
    }

    public void checkBalance() {
        System.out.println("Your Account Balance is Rs : " + balance);
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Welcome to our Bank");
        System.out.println("-------------------------");
        Bank_Application bank = new Bank_Application(12457924);

        do {
            System.out.println("Choose one option from below : ");
            System.out.println(" 1. Withdraw Amount ");
            System.out.println(" 2. Deposit Amount ");
            System.out.println(" 3. Check Balance ");
            System.out.println(" 4. Exit ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your withdraw amount : ");
                    double withdrawAmount = sc.nextDouble();
                    bank.withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.println("Enter your deposit amount :");
                    double depositAmount = sc.nextDouble();
                    bank.deposit(depositAmount);
                    break;

                case 3:
                    bank.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using our Bank");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose again.");
                    break;
            }
        } while (choice != 4);

    }
}
