package OOPS_LAB.Program_3;

class vector{
    private int x;
    private int y;
    private int z;

    public vector(int xip,int yip,int zip) {
        x=xip;
        y=yip;
        z=zip;
    }

    public void VectorMagnitude()
    {
        double sumOfSquare = Math.pow(this.x, 2)+Math.pow(this.y, 2)+Math.pow(this.z, 2);

        double ans = Math.sqrt(sumOfSquare);
        System.out.println("\nMagnitu of vector "+ans);
    }
}

public class vector3d {
    public static void main(String[] args) {
        vector vec1 = new vector(3, 4, 5);
        vec1.VectorMagnitude();
    }
}
