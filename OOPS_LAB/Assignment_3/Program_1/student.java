
import java.util.Scanner;

class StudentDetails{
    protected  String name;
    protected  String rollNumber;

    StudentDetails() {
        name="";
        rollNumber="";
    }
    
    StudentDetails(String name, String rollNumber) {
        this.name=name;
        this.rollNumber=rollNumber;
    }
}

class ResultDetails extends StudentDetails{
    protected  int[] marks=new int[3];

    ResultDetails() {
        super();
    }

    ResultDetails(String name, String rollNumber, int[] marks){
        super(name,rollNumber);
        for (int i=0; i<3; i++) {
            this.marks[i]=marks[i];
        }
    }

    public int totalMarks()
    {
        int ans=0;
        for(int i=0; i<3; i++)
        {
            ans+=marks[i];
        }
        return ans;
    }

    public int avgMarks()
    {
        return totalMarks()/3;
    }

    public void display()
    {
        System.out.println("\tStudent Details\t");
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollNumber);
        System.out.println("\tMarks\t");
        for(int i=0; i<3; i++)
        {
            System.out.println("Sub "+(i+1)+" : "+marks[i]);
        }
        System.out.println("Total Marks : "+totalMarks());
        System.out.println("Average Marks : "+avgMarks());
    }
}

public class student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name,rollNumber;
        int[] marks=new int[3];

        System.out.print("Please Enter Your Name : ");
        name=sc.nextLine();

        System.out.print("Please Enter Your Roll Number : ");
        rollNumber=sc.nextLine(); 

        for(int i=0; i<3; i++)
        {
            System.out.print("Please Enter the marks of Subject "+(i+1)+" : ");
            marks[i]=sc.nextInt();
        }
        ResultDetails ob1 = new ResultDetails(name,rollNumber,marks);
        ob1.display();
    }
}
