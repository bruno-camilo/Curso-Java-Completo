package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private static double RATE = 5.00;

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(int number, String name) {
        this.number = number;
        this.holder = name;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String name) {
        this.holder = name;
    }

    public void deposit(double amount ){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount + RATE;
    }

    public String toString(){
        return String.format("Account data: %n")
                + "Account "
                + number
                + ", "
                + "Holder: "
                + holder
                + " Balance: $"
                + String.format("%.2f ",balance);

    }
}
