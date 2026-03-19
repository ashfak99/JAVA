class AccountGen{
    private String HolderName;
    private int AccountNumber;
    private double Balance;

    private int AccountNumGen()
    {
        double acNum = Math.random()*100000000;
        return (int)acNum;
    }

    private double BalanceGen()
    {
        double Balance = Math.random()*10000;
        return Math.round(Balance);
    }

    public AccountGen(String name) {
        this.HolderName=name;
        this.AccountNumber=AccountNumGen();
        this.Balance=BalanceGen();
    }

    public void display()
    {
        System.out.println("Name : "+this.HolderName);
        System.out.println("Account Number "+this.AccountNumber);
        System.out.println("Balance : "+this.Balance);
    }
}

public class account{
    public static void main(String[] args) {
        AccountGen user1 = new AccountGen("Ashfak");
        user1.display();
    }
}