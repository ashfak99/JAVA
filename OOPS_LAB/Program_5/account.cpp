#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>
#include <cmath>

using namespace std;

class AccountGen {
private:
    string HolderName;
    int AccountNumber;
    double Balance;

    int AccountNumGen() {
        return rand() % 100000000;
    }

    double BalanceGen() {
        double bal = (rand() % 1000000) / 100.0;
        return round(bal);
    }

public:
    AccountGen(string name) {
        HolderName = name;
        AccountNumber = AccountNumGen();
        Balance = BalanceGen();
    }

    void display() {
        cout << "Name : " << HolderName <<endl;
        cout << "Account Number : " << AccountNumber <<endl;
        cout << "Balance : " << Balance <<endl;
    }
};

int main() {
    srand(time(0)); 
    
    AccountGen user1("Ashfak");
    user1.display();

    return 0;
}