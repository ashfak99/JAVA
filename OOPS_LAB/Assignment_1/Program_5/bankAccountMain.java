
class BankAccount{
    private String name;
    private String acType;
    private int acNumber;
    private double balance = 10000;

    BankAccount(String name, String acType, int acNumber) {
        this.name = name;
        this.acType = acType;
        this.acNumber = acNumber;
    }

    void deposite(double amt)
    {
        balance+=amt;
    }

    void withdraw(double amt)
    {
        if(amt<=balance)
        {
            balance-=amt;
            System.out.println("Withdraw Amount : "+amt);
        }
        else{
            System.out.println("Insufficiant Balance");
        }
    }

    void display()
    {
        System.out.println("Account Holder Name : "+name);
        System.out.println("Balance : "+balance);
    }
}

class bankAccountMain {
    public static void main(String[] args) {
        BankAccount ac1 = new BankAccount("Ashfak", "Saving", 99999);
        ac1.deposite(500);
        ac1.display();
    }
}
