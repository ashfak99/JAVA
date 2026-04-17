import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {9,5,6,2,3,4,6,8,2,1,7};
        int n,m;

        System.out.print("Please enter the N and M : ");
        n=scan.nextInt();
        m=scan.nextInt();

        int[] array2 = Arrays.copyOfRange(array, n, m);

        System.out.print("Original Array : ");
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
        }

        System.out.print("\nCopy Array : ");
        for(int i=0; i<array2.length; i++)
        {
            System.out.print(array2[i]+" ");
        }
    }
}