
import java.util.Scanner;


class Vehicle {
    protected String brand;
    protected double speed;

    Vehicle() {
        brand = "";
        speed = 0.0;
    }

    Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Car extends Vehicle {
    private String model;

    Car() {
        super();
        model = "";
    }

    Car(String brand, double speed, String model) {
        super(brand, speed);
        this.model = model;
    }

    void display() {
        System.out.println("\tCAR DETAILS");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand,model;
        double speed;

        System.out.print("Enter BrandName : ");
        brand=sc.nextLine();

        System.out.print("Enter Model Name : ");
        model=sc.nextLine();

        System.out.print("Enter Speed : ");
        speed=sc.nextDouble();

        Car myCar = new Car(brand,speed,model);
        
        myCar.display();
    }
}