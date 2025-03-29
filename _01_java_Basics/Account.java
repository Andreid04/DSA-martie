package _01_java_Basics;

public class Account {
    //instance variables (non-static fields)
    private String name;
    private double balance;

    //class variables(static fields)
    private static int totalAccounts = 0;

    //constructor cu param

    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
        totalAccounts++;//ne folosim de var statica
    }

    //method
public void deposit(double amount){
    this.balance +=amount;
    System.out.println("Deposit efectuat cu succes");
}

//Method: withdraw
public void withdraw(double amount){
    if(this.balance>amount) {
    balance-=amount;
    System.out.println("Ai retras cu succes");
} else   {
    System.out.println("Fonduri insuficiente");
}
}

public void displayInfo(){
    System.out.println("Nume "+this.name);
    System.out.println("Balanta "+this.balance);
    System.out.println("Numar de conturi "+totalAccounts);

}

    public static void main(String[] args) {
        Account account1 = new Account("Gigel",2500);
        Account account2 = new Account("Andrei",4000);

        account1.deposit(1500);
        account1.displayInfo();

        Account account3 = new Account("Mihai",5000);
        account2.displayInfo();
    }

}
