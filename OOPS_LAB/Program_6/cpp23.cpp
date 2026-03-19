#include <print>
#include <vector>
#include <string>
#include <ranges>
#include <algorithm>

using namespace std;

class Student {
private:
    string name;
    int roll;
    vector<int> marks;

    int totalMarks() const {
        return ranges::fold_left(marks, 0, plus<>());
    }

    float avgMarks() const {
        if (marks.empty()) return 0.0f;
        return static_cast<float>(totalMarks()) / marks.size();
    }

public:
    Student(string n, int r, vector<int> m) 
        : name(move(n)), roll(r), marks(move(m)) {}

    void display() const {
        println("Name : {}", name);
        println("Roll No : {}", roll);
        println("Subject\tMarks");

        for (auto const& [i, mark] : views::enumerate(marks)) {
            println("SUB{}\t{}", i + 1, mark);
        }

        println("Total Marks: {}", totalMarks());
        println("Avg Marks: {:.2f}", avgMarks()); 
    }
};

int main() {
    vector<int> marks = {50, 60, 70};
    
    Student std1("Ashfak", 253004, marks);
    std1.display();

    return 0;
}