class Complex:
    def __init__(self,real=0,imaginary=0):
        self.real=real
        self.imaginary=imaginary

    def add(self,c1,c2):
        self.real=c1.real+c2.real
        self.imaginary=c1.imaginary+c2.imaginary
    
    def display(self):
        if self.imaginary >= 0 :
            print(f"{self.real}+{self.imaginary}i")
        else :
            print(f"{self.real}-{-self.imaginary}i")

if __name__=="__main__":
    c1=Complex(1,2)
    c2=Complex(3,4)
    result=Complex()

    result.add(c1,c2)
    result.display()