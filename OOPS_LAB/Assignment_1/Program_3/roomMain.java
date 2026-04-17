
class Room{
    private double length;
    private double breadth;

    Room(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    private double area(){
        return length*breadth;
    }

    void display()
    {
        System.out.println("Length : "+length);
        System.out.println("Breadth : "+breadth);
        System.out.println("Area : "+area());
    }

}

class roomMain {
    public static void main(String[] args) {
        Room r1 = new Room(3, 4);
        r1.display();
    }
}
