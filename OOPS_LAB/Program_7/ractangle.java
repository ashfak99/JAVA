
class RactangleClass{
    private int length;
    private int breadth;

    public RactangleClass() {
        this.length=3;
        this.breadth=4;
    }

    public RactangleClass(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    private  int area()
    {
        return length*breadth;
    }

    private  int perimeter()
    {
        return 2*(length+breadth);
    }

    public void display()
    {
        System.out.println("Length : "+length);
        System.out.println("Breadth : "+breadth);
        System.out.println("Area of Rectangle : "+area());
        System.out.println("Perimeter of Rectangle : "+perimeter());
    }
}

public class ractangle {
    public static void main(String[] args) {
        RactangleClass ob1 = new RactangleClass(); // DEFAULT 
        RactangleClass ob2 = new RactangleClass(5,2); // PARAMETERIZED

        System.out.println("Default Parameterized");
        ob1.display();
        System.out.println("\nParameterized");
        ob2.display();
    }
}
