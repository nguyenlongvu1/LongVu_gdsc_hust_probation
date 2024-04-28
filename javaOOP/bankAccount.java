public class bankAccount {
    protected float balance;
    protected final int FEE=5000;
    protected String name;
    protected int accountNumber;
    public bankAccount(String name, float balance,int accountNumber) {
        this.balance = balance;
        this.name=name;
        this.accountNumber=accountNumber;
    }
    public void increase(float inc)
    {
        balance+=inc;
    }
    public void decrease(float dec)
    {
        balance=balance-dec-FEE;
        if(balance<=50000)
        {
            balance=balance+dec+FEE;
            System.out.println("Your account is not enough to make transactions");
        }
    }
    public float getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public void printUserData()
    {
        System.out.println("Name    : "+getName());
        System.out.println("Balance : "+getBalance());
    }
}
