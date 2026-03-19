class EmployeeDetails{
    private String empId;
    private String empName;
    private double basicSalary;
    private double hra=0.3;
    private double da=0.4; 

    public EmployeeDetails(String ipId, String ipName, double  ipSalary) {
        this.empId=ipId;
        this.empName=ipName;
        this.basicSalary=ipSalary;
    }
    
    private double grossSalary()
    {
        double hraB = basicSalary*hra;
        double dab = basicSalary*da;
        return basicSalary+hraB+dab;
    }

    public void display()
    {
        System.out.println("Id : "+this.empId);
        System.out.println("Name : "+this.empName);
        System.out.println("\tSalary  ");
        System.out.println("Basic Salary : "+this.basicSalary);
        System.out.println("HRA :"+basicSalary*this.hra);
        System.out.println("DA : "+basicSalary*this.da);
        System.out.println("Gross Salary : "+grossSalary());
    }
}

public class employee {
    public static void main(String[] args) {
        EmployeeDetails emp1 = new EmployeeDetails("CSE253004", "Ashfak Alam", 5800);
        emp1.display();
    }
}
