import java.util.Scanner;

class BankAccount{
    private double balance;

    public BankAccount(double initialbalance){
        this.balance = initialbalance;
    }

    public void deposite(double amount){
        if(amount<=0){
            System.out.println("Invalid amount!");
        }
        else{
            balance+=amount;
            System.out.println("Rs. "+amount+" deposited successfully!");
        }
    }

    public void withdrawn(double amount){
        if(amount<=0){
            System.out.println("Invalid withdrawn amount!");
        }
        else if(amount>balance){
            System.out.println("Insufficient balance!");
        }
        else{
            balance-=amount;
            System.out.println("Rs. "+amount+" withdrawn successfully!");
        }
    }

    public void checkBalance(){
        System.out.println("Current balance: Rs. "+balance);
    }
}

class ATM{
    private BankAccount account;
    private Scanner sc = new Scanner(System.in);

    public ATM(BankAccount account){
        this.account = account;
    }

    public void showMenu(){
        while(true){
            System.out.println("\nChoose an option...");
            System.out.println("1 Deposite Amount");
            System.out.println("2 Withdrawn Amount");
            System.out.println("3 Check Balance");
            System.out.println("4 Exit\n");
            
            int choice = sc.nextInt();  
            
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposite: ");
                    double dAmount = sc.nextDouble();
                    account.deposite(dAmount);
                    break;
                
                case 2:
                    System.out.print("Enter amount to withdrawn: ");
                    double wAmount = sc.nextDouble();
                    account.withdrawn(wAmount);
                    break;
                
                case 3:
                    account.checkBalance();
                    break;
                
                case 4:
                    System.out.println("Thank you for using our ATM!\n");
                    System.exit(0);

                default:
                    System.out.println("Invalid Input! Please enter given option");
                    break;
            }
        }
    }
}
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to create account: ");
        double initialbalance = sc.nextDouble();

        BankAccount account  = new BankAccount(initialbalance);

        ATM atm = new ATM(account);
        atm.showMenu();
        sc.close();
    }
}