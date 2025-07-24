import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Step 1: Declare variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

        //Step 2: Display a menu
        while (isRunning) {
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            //Step 3: Get and process users choice
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice.");
            }
        }
        //Step 7: Create a EXIT message at the end.
        System.out.println("***************************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("***************************");



        scanner.close();
    }
    //Step 4: Create  a method of showBalance()
    static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }
    //Step 5: Another method to add a deposit()
    static double deposit(){

        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }

    }
    //Step 6: Adding another method to withdraw()
    static double withdraw(double balance){

        double amount;

        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("***************************");
            System.out.println("INSUFFICENT FUNDS");
            return 0;

        }
        else if (amount < 0) {
            System.out.println("***************************");
            System.out.println("Amount can't be negative");
            return 0;

        }
        else {
            return amount;
        }
    }
}