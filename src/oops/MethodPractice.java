package oops;

/**
 * In this class we will see static and instance method
 */

class Account{
    private String accountHolder;
    private double balance;

    public Account(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

//    Instance method
    public void deposit(double amount){
        balance += amount;
        System.out.println(accountHolder+ " deposited: " + amount);
    }

//    Instance method
    public void displayBalance(){
        System.out.println(accountHolder + "'s balance: "+ balance);
    }

//    static method
    public static void bankDetails(){
        System.out.println("Bank Name: ABC Bank");
    }
}


public class MethodPractice {
    public static void main(String[] args){
//        call static method
        Account.bankDetails();

//        create instance
        Account acc = new Account("Priyanshu Chourasia",45);
        Account acc2 = new Account("Raj",56);

        acc.deposit(600);
        acc.displayBalance();

        acc2.deposit(400);
        acc2.displayBalance();
    }
}
