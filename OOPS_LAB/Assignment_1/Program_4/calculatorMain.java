
class Calculator{
    private int num1,num2;

    Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    private int add()
    {
        return num1+num2;
    }

    private int subtract()
    {
        return num1-num2;
    }

    void display()
    {
        System.out.println("Addition : "+add());
        System.out.println("Subtraction : "+subtract());
    }
}

class calculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator(4,2);
        cal.display();
    }
}