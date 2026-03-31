import java.util.Scanner;

class Person{
    protected String name;
    protected int age;

    Person() {
        name="";
        age=0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person{
    protected String employeeId;
    protected double salary;

    Employee() {
        super();
        employeeId="";
        salary=0;
    }

    public Employee(String name, int age,String employeeId, double salary) {
        super(name,age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
}

class ManagerDetails extends Employee{
    protected String deptName;

    ManagerDetails() {
        super();
        deptName="";
    }

    ManagerDetails(String name, int age,String employeeId, double salary,String deptName) {
        super(name, age, employeeId, salary);
        this.deptName = deptName;
    }

    void display()
    {
        System.out.println("\tDetails\t");
        System.out.println("Employee Id : "+employeeId);
        System.out.println("Name : "+name);
        System.out.println("Department : "+deptName);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
    }
}
public class manager {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name,employeeId,deptName;
        int age;
        double salary;

        System.out.print("Please Enter Your Name : ");
        name=sc.nextLine();

        System.out.print("Please Enter Your Id : ");
        employeeId=sc.nextLine();

        System.out.print("Please Enter Your Department Name : ");
        deptName=sc.nextLine();

        System.out.print("Please Enter Your Salary : ");
        salary=sc.nextDouble();

        System.out.print("Please Enter Your Age : ");
        age=sc.nextInt();

        ManagerDetails mg = new ManagerDetails(name, age, employeeId, salary, deptName);

        mg.display();
    }
}