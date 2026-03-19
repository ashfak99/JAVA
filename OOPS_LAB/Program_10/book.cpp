#include<iostream>
#include<print>
using namespace std;

class Book{
    string title;
    string author;
    float price;
  public:
    Book(string tit, string auth, float pri) : title(tit),author(auth),price(pri){}

    void display()
    {
        println("Title : {}",title);
        println("Author : {}",author);
        println("Price : RS.{}",price);
    }
};

int main(int argc, char const *argv[])
{
    Book book1("DSA","Ashfak Alam",1999);
    book1.display();
    return 0;
}