#include<iostream>
#include<cmath>
using namespace std;

class Vector3D{
    private:
        int x,y,z;
    public:

    Vector3D(int xIP,int yIP,int zIP)
    {
        x=xIP;
        y=yIP;
        z=zIP;
    }

    void VectorMagnitude()
    {
        double sumOfSquare=pow(x,2)+pow(y,2)+pow(z,2);
        double ans = sqrt(sumOfSquare);
        cout<<"Magnitude of vector : "<<ans;
    }
};

int main(int argc, char const *argv[])
{
    Vector3D *vec1 = new Vector3D(3,4,5);
    vec1->VectorMagnitude();
    delete vec1;
    return 0;
}
