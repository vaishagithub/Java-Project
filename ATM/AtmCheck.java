import java.util.Scanner;
public class AtmCheck {
    static double balance = 5000;

    //check balance
    static void checkBalance(){
        System.out.println("Current Balance: " + balance);
    }

    //Deposit money

    static void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("₹" + amount + "deposited Successfully");
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    //Withdraw money
    static void withdraw(double amount){
        if(amount <=0){
            System.out.println("Invalid amount");

        }
        else if(amount > balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance=balance-amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
           System.out.println("\n===== ATM MENU =====");
           System.out.println("1.Check Balance");
           System.out.println("2.Deposit");
           System.out.println("3.Withdraw");
           System.out.println("4.Exit");
           System.out.println("Enter your Choice:");
           choice =sc.nextInt();
            switch(choice){
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount:");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter withdrawal amount:");
                    double withdrawAmount =sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM!");
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice != 4);
        sc.close();
    }
}
