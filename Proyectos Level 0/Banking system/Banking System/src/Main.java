import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String user = "KedGarci4",password="1234";
        boolean auth=false;
        int option,amount,deposit,withdraw,transfer,balance = 2000;
        System.out.println("Welcome to ABC Bank!");
        System.out.println("Enter with your user and password:");
        System.out.println("User:");
        user=read.nextLine();
        System.out.println("Password:");
        password=read.nextLine();
        if (user.equals("KedGarci4") && password.equals("1234")){
                auth=true;
        }else{
            System.out.println("Access error. Please, try again. You have 2 attempts left");
            System.out.println("Enter with your user and password:");
            System.out.println("User:");
            user=read.nextLine();
            System.out.println("Password:");
            password=read.nextLine();
            if (user.equals("KedGarci4") && password.equals("1234"))
                auth=true;
            if(!auth) {
                System.out.println("Access error. Please, try again. You have 1 attempt left");
                System.out.println("Enter with your user and password:");
                System.out.println("User:");
                user=read.nextLine();
                System.out.println("Password:");
                password=read.nextLine();
                if (user.equals("KedGarci4") && password.equals("1234"))
                    auth=true;
                if(!auth){
                    System.out.println("Access error. You cannot access to the system.");
                }
            }
        }
        if (auth){
            System.out.println("Welcome to ABC Bank");
            System.out.println("What type of transaction do you want to make?");
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) View balance");
            System.out.println("4) Transfer money");
            System.out.println("5) Exit");
            option=read.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter the amount of money do you want to deposit:");
                    amount=read.nextInt();
                    deposit=balance+amount;
                    System.out.println("Your current balance: $"+deposit);
                    break;
                case 2:
                    System.out.println("Enter the amount of money do you want to withdraw:");
                    amount=read.nextInt();
                    withdraw=balance-amount;
                    System.out.println("Your current balance: $"+withdraw);
                    break;
                case 3:
                    System.out.println("Your current balance: $"+balance);
                    break;
                case 4:
                    System.out.println("Enter the amount of money do you want to transfer?:");
                    amount=read.nextInt();
                    transfer=balance-amount;
                    System.out.println("Your current balance: $"+transfer);
                    break;
                case 5:
                    System.out.println("Thank you! Goodbye!");
                    break;
            }
        }
    }
}