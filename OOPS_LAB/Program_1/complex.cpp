#include<iostream>
using namespace std;

class Complex{
  private:
    int real;
    int imaginary;
  public:
    Complex()
    {
        real=0;
        imaginary=0;
    }

    Complex(int rl,int im)
    {
        real=rl;
        imaginary=im;
    }

    void add(Complex c1, Complex c2)
    {
        real = c1.real+c2.real;
        imaginary=c1.imaginary+c2.imaginary;
    }

    void display()
    {
        if (imaginary>=0)
        {
            cout<<real<<"+"<<imaginary<<"i"<<endl;
        }
        else{
            cout<<real<<"-"<<-imaginary<<"i"<<endl;
        }
    }
};

int main(int argc, char const *argv[])
{
    Complex* c1 = new Complex(1,4);
    Complex* c2 = new Complex(2,6);
    Complex result;

    result.add(*c1,*c2);
    cout<<"Addition : ";
    result.display();
    
    return 0;
}
