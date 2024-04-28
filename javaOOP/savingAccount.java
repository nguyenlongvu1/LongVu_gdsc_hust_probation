public class savingAccount extends bankAccount{
    private float interests=0; 
    public float interestRate;
    
    public savingAccount(String name, float balance,int accountNumber, float interestRate) {
        super.bankAccount(name,balance,accountNumber);
        this.interestRate = interestRate;
    }
    public float InterestsInAMonth()
    {
        interests=this.getBalance()*interestRate/12;
        return interests;
    }
    public void printInterestData()
    {
        System.out.println("Interest in a month: "+InterestsInAMonth());
    }

}
