import java.util.Scanner;

class EmployeeDetails{
    protected  String employeeId;
    protected  String name;

    EmployeeDetails() {
        employeeId="";
        name="";
    }

    EmployeeDetails(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
}

class Salary extends EmployeeDetails{
    protected double basicSalary;
    protected double hra=0.4;
    protected double da=0.3;
    Salary()
    {
        super();
        basicSalary=0;
    }

    public Salary(String employeeId,String name,double basicSalary) {
        super(employeeId,name);
        this.basicSalary = basicSalary;
    }

    double grossSalary()
    {
        return basicSalary+(basicSalary*hra)+(basicSalary*da);
    }

    void display()
    {
        System.out.println("\tEmployee Details");
        System.out.println("Employee Id : "+employeeId);
        System.out.println("Employee Name : "+name);
        System.out.println("Basic Salary : "+basicSalary);
        System.out.println("Total Salary : "+grossSalary());
    }
}

public class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String EmpName,EmpId;
        double basicSalary;

        System.out.print("Please Enter Employee Name : ");
        EmpName=sc.nextLine();

        System.out.print("Please Enter Employee Id : ");
        EmpId=sc.nextLine();

        System.out.print("Please Enter Basic Salary : ");
        basicSalary=sc.nextDouble();
    
        Salary emp = new Salary(EmpId,EmpName,basicSalary);
        
        emp.display();
    }
}
