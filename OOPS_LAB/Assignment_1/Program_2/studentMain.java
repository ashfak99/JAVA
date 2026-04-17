
class Student{
    private String name;
    private String rollNumber;

    Student() {
        name="";
        rollNumber="";
    }

    Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollNumber);
    }
    
}

public class studentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Ashfak", "CSE253004");
        s1.display();
    }
}
