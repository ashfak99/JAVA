import java.util.Scanner;

abstract class Media {
    protected  String title;
    protected double price;

    Media() {
        title = "";
        price = 0;
    }

    Media(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("\nFrom Media Class");
        System.out.println("Title : " + title);
        System.out.println("Price : " + price);
    }
}

class Book extends Media {
    private int pages;

    Book() {
        super();
        pages = 0;
    }

    public Book(String title, double price, int pages) {
        super(title, price);
        this.pages = pages;
    }

    @Override
    void display() {
        System.out.println("\nFrom Book Class ");
        System.out.println("Title : " + title);
        System.out.println("Price : " + price);
        System.out.println("Pages : " + pages);
    }
}

class Tape extends Media {
    private double duration;

    Tape() {
        super();
        duration = 0;
    }

    public Tape(double duration, String title, double price) {
        super(title, price);
        this.duration = duration;
    }

    @Override
    void display() {
        System.out.println("\nFrom Tape Class ");
        System.out.println("Title : " + title);
        System.out.println("Price : " + price);
        System.out.println("Duration : " + duration);
    }
}

public class mediaMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String title;
        double price;

        System.out.println("Choose Which Object You want to create : \n1.BOOK\n2.Tape :");
        int choice = scan.nextInt();
        scan.nextLine(); 

        switch (choice) {
            case 1:
                System.out.print("Enter Title: ");
                title = scan.nextLine();
                System.out.print("Enter Price: ");
                price = scan.nextDouble();
                System.out.print("Enter Pages: ");
                int pages = scan.nextInt();

                Book b1 = new Book(title, price, pages);
                b1.display();
                break;
            case 2:
                System.out.print("Enter Title: ");
                title = scan.nextLine();
                System.out.print("Enter Price: ");
                price = scan.nextDouble();
                System.out.print("Enter Duration: ");
                double duration = scan.nextDouble();

                Tape t1 = new Tape(duration, title, price);
                t1.display();
                break;
            default:
                System.out.println("Invalid choice");
        }
        scan.close();
    }
}