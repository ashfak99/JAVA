class Account{
    accountNumberGen()
    {
        var num = Math.random()*10000000000
        num = Math.round(num)
        return num
    }

    balanceGen()
    {
        var num = Math.random()*10000
        num = Math.round(num)
        return num
    }
    constructor(name = "")
    {
        this.HolderName = name
        this.AccountNumber = this.accountNumberGen()
        this.balance = this.balanceGen()
    }

    display()
    {
        console.log(`Name : ${this.HolderName}\nAccount No : ${this.AccountNumber}\nBalance : ${this.balance}`)
    }
}


const user1 = new Account("Ashfak")
user1.display()