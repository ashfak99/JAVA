import math

class Vector3D:
    def __init__(self,x,y,z):
        self.x=x
        self.y=y
        self.z=z

    def VectorMagnitude(self):
        sumOfSquare = pow(self.x,2)+pow(self.y,2)+pow(self.z,2)
        ans = math.sqrt(sumOfSquare)
        print(f"Magnitude of Vector {ans}")
    
if __name__=="__main__":
    vec1 = Vector3D(3,4,5)
    vec1.VectorMagnitude()