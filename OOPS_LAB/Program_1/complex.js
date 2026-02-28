class Complex{
    constructor(real=0,imaginary=0)
    {
        this.real=real;
        this.imaginary=imaginary;
    }

    add(c1,c2)
    {
        this.real=c1.real+c2.real;
        this.imaginary=c1.imaginary+c2.imaginary;
    }

    display()
    {
        if(this.imaginary>=0)
        {
            console.log(`${this.real}+${this.imaginary}i`);
        }
        else{
            console.log(`${this.real}-${-this.imaginary}i`);
        }
    }
}

const c1 = new Complex(1,2);
const c2 = new Complex(3,4);
const c3 = new Complex();

c3.add(c1,c2);
c3.display();