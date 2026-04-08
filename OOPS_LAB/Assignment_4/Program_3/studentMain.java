import java.util.Scanner;

abstract class Student {
    abstract void getPercentage();
}

class ScienceStudent extends Student {
    private int[] marks = new int[3];

    ScienceStudent(int[] marks) {
        for (int i = 0; i < 3; i++) {
            this.marks[i] = marks[i];
        }
    }

    @Override
    void getPercentage() {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += marks[i];
        }
        double percentage = (double) total / 3;
        System.out.println("Science Student Percentage: " + percentage + "%");
    }
}

class ArtsStudent extends Student {
    private int[] marks = new int[4];

    ArtsStudent(int[] marks) {
        for (int i = 0; i < 4; i++) {
            this.marks[i] = marks[i];
        }
    }

    @Override
    void getPercentage() {
        int total = 0;
        for (int i = 0; i < 4; i++) {
            total += marks[i];
        }
        double percentage = (double) total / 4;
        System.out.println("Arts Student Percentage: " + percentage + "%");
    }
}

public class studentMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter marks for Science Student (3 subjects):");
        int[] sMarks = new int[3];
        for (int i = 0; i < 3; i++) {
            sMarks[i] = scan.nextInt();
        }
        ScienceStudent s1 = new ScienceStudent(sMarks);

        System.out.println("Enter marks for Arts Student (4 subjects):");
        int[] aMarks = new int[4];
        for (int i = 0; i < 4; i++) {
            aMarks[i] = scan.nextInt();
        }
        ArtsStudent a1 = new ArtsStudent(aMarks);

        s1.getPercentage();
        a1.getPercentage();

        scan.close();
    }
}