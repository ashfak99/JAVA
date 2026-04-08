import java.util.Scanner;

abstract class Shape {
    void displayArea() {
        System.out.println("Display area from base class");
    }
}

class circle extends Shape {
    private double radius;

    circle() {
        radius = 0;
    }

    circle(double radius) {
        this.radius = radius;
    }

    @Override
    void displayArea() {
        System.out.println("Area of Circle : " + (Math.PI * radius * radius));
    }
}

class rectangle extends Shape {
    private double length, breadth;

    rectangle() {
        length = 0;
        breadth = 0;
    }

    rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void displayArea() {
        System.out.println("Area of Rectangle : " + (length * breadth));
    }
}

public class shapeMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose Shape: \n1. Circle \n2. Rectangle");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Radius: ");
                double r = scan.nextDouble();
                circle c1 = new circle(r);
                c1.displayArea();
                break;

            case 2:
                System.out.print("Enter Length: ");
                double l = scan.nextDouble();
                System.out.print("Enter Breadth: ");
                double b = scan.nextDouble();
                rectangle r1 = new rectangle(l, b);
                r1.displayArea();
                break;

            default:
                System.out.println("Invalid Choice!");
        }
        scan.close();
    }
}