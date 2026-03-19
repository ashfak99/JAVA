class StudentDetails{
    private String name;
    private int roll;
    private int[] marks = new int[3];

    public StudentDetails(String nameI,int rollI, int[] scores)
    {
        name=nameI;
        roll=rollI;
        for(int i=0; i<scores.length; i++)
        {
            this.marks[i]=scores[i];
        }
    }

    private  int totalMarks()
    {
        int total=0;
        for(int i=0; i<marks.length; i++)
        {
            total+=marks[i];
        }
        return total;
    }

    private  double avgMarks()
    {
        double avg =(double)totalMarks()/marks.length;
        return avg;
    }

    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+roll);
        System.out.println("Subject\tMarks");
        for(int i=0; i<marks.length; i++)
        {
            System.out.println("SUB"+(i+1)+"\t"+marks[i]);
        }
        System.out.println("Total Marks "+ totalMarks());
        System.out.println("Avg Marks "+ avgMarks());
    }
}

class student{
    public static void main(String[] args) {
        int[] marks = {30,40,50};
        StudentDetails std1 = new StudentDetails("Ashfak", 3004, marks);
        std1.display();
    }
}