import random

class AccountGen:
    def __init__(self, name):
        self.HolderName = name
        self.AccountNumber = self.AccountNumGen()
        self.Balance = self.BalanceGen()

    def AccountNumGen(self):
        acNum = random.random() * 100000000
        return int(acNum)

    def BalanceGen(self):
        balance = random.random() * 10000
        return round(balance)

    def display(self):
        print(f"Name : {self.HolderName}")
        print(f"Account Number : {self.AccountNumber}")
        print(f"Balance : {self.Balance}")

if __name__ == "__main__":
    user1 = AccountGen("Ashfak")
    user1.display()