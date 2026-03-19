#include <print>

using namespace std;

class Rectangle {
private:
    int length;
    int breadth;

    int area() const {
        return length * breadth;
    }

    int perimeter() const {
        return 2 * (length + breadth);
    }

public:
    Rectangle() : length(3), breadth(4) {}

    Rectangle(int len, int bre) : length(len), breadth(bre) {}

    void display() const {
        println("Length : {}", length);
        println("Breadth : {}", breadth);
        println("Area of Rectangle : {}", area());
        println("Perimeter of Rectangle : {}", perimeter());
    }
};

int main() {
    Rectangle rac1;
    Rectangle rac2(5, 2);
    
    rac1.display();
    rac2.display();
    
    return 0;
}