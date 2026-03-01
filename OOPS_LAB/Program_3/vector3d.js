class Vector3D{
    constructor(x=0,y=0,z=0)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    VectorMangitude()
    {
        const sumOfSquare = Math.pow(this.x,2)+Math.pow(this.y,2)+Math.pow(this.z,2);
        const ans=Math.sqrt(sumOfSquare);
        console.log(`Magnitude of Vector : ${ans}`)
    }
}

const vec1 = new Vector3D(3,4,5)
vec1.VectorMangitude()