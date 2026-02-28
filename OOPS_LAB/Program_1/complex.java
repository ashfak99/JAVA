package OOPS_LAB.Program_1;

class ComplexNumber{
    private int real;
    private int imaginary;

    public ComplexNumber()
    {
        real=0;
        imaginary=0;
    }

    public ComplexNumber(int rel, int imagina)
    {
        real=rel;
        imaginary=imagina;
    }

    public void add(ComplexNumber c1, ComplexNumber c2)
    {
        this.real=c1.real+c2.real;
        this.imaginary=c1.imaginary+c2.imaginary;
    }
    public void display()
    {
        if(imaginary>=0)
        {
            System.out.println(real+"+"+imaginary+"i");
        }
        else{
            System.out.println(real+"-"+(-imaginary)+"i");
        }
    }
}

public class complex{
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4,5);
        ComplexNumber c2 = new ComplexNumber(2, 1);

        ComplexNumber result= new ComplexNumber();

        result.add(c1, c2);
        result.display();
    }
}