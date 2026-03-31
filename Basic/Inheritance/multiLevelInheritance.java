class Vehicle{
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

class FourWheeler extends Vehicle{
    FourWheeler()
    {
        System.out.println("This Vehicle is 4 Wheeler");
    }
}

class Car extends FourWheeler{
    Car(){
        System.out.println("This is 4 Wheeler Car");
    }
}

public class multiLevelInheritance {
    public static void main(String[] args) {
        Car obj=new Car();
    }
}
