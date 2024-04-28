public class customer {
    public static final float interestRate=0.12F;
    public static void main(String[] args)
    {
        bankAccount Person1=new bankAccount("Long", 200000F,123456);
        savingAccount Person2=new savingAccount("Vu", 350000F, 341675, interestRate);
        Person1.printUserData();
        Person2.printUserData();
        Person2.printInterestData();
        Person1.increase(50000);
        Person2.decrease(300000);
        Person1.printUserData();
        Person2.printUserData();
        Person2.printInterestData();
        Person2.decrease(30000);
        Person2.printUserData();
        Person2.printInterestData();
    }
}
