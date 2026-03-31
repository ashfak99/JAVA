import java.util.Scanner;

class shapeTmplt{

    shapeTmplt() {
        System.out.println("\nThis message inherite from Shape(base) Class");
    }

}

class Rectangle extends shapeTmplt{
    private double length,breadth;

    Rectangle() {
        length=0;
        breadth=0;
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area()
    {
        return length*breadth;
    }

    void display(){
        System.out.println("\n\tRECTANGLE");
        System.out.println("Length : "+length+"  Breadth : "+breadth);
        System.out.println("Area : "+area());
    }

}

class Circle extends shapeTmplt{
    private double radius;

    Circle() {
        radius=0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double area()
    {
        return 3.14*radius*radius;
    }
    
    void display()
    {
        System.out.println("\n\tCIRCLE");
        System.out.println("Radius : "+radius);
        System.out.println("Area : "+area());
    }
}

public class shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length,breadth,radius;

        System.out.print("Please Enter Length : ");
        length=sc.nextDouble();

        System.out.print("Please Enter Breadth : ");
        breadth=sc.nextDouble();

        System.out.print("Please Enter Radius : ");
        radius=sc.nextDouble();

        Rectangle rc = new Rectangle(length,breadth);
        rc.display();
        
        Circle cl = new Circle(radius);
        cl.display();
    }
}
