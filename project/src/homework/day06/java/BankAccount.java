package homework.day06.java;

public class BankAccount {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        Account account = new Account(1000,2000,0.0123);
        customer.setAccount(account);
        account.deposit(100);
        account.withdraw(960);
        account.withdraw(2000);
    }
}

class Account{
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount){
        //提款方法
        if(amount<=balance){
            balance -= amount;
            System.out.println("成功取出："+amount);
        }else {
            System.out.println("余额不足，取款失败");
        }
    }

    public void deposit(double amount){
        //存款方法
        balance += amount;
        System.out.println("成功存入："+amount);
    }
}

class Customer{
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f,String l){
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}