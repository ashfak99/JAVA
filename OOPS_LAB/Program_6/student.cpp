#include<iostream>
#include<vector>
using namespace std;

class Student {
private:
    string name;
    int roll;
    vector<int> marks;

    int totalMarks() {
        int total = 0;
        for (auto x : marks) {
            total += x;
        }
        return total;
    }

    float avgMarks() {
        if (marks.empty()) return 0;
        return (float)totalMarks() / marks.size();
    }

public:
    Student(string name, int roll, vector<int> m) : name(name), roll(roll), marks(m) {}

    void display() {
        cout << "Name : " << name << endl;
        cout << "Roll No : " << roll << endl;
        cout << "Subject\tMarks" << endl;

        for (int i = 0; i < marks.size(); i++) {
            cout << "SUB" << (i + 1) << "\t" << marks[i] << endl;
        }

        cout << "Total Marks: " << totalMarks() << endl;
        cout << "Avg Marks: " << avgMarks() << endl;
    }
};

int main() {
    vector<int> marks = {50, 60, 70};
    
    Student std1("Ashfak", 253004, marks);
    std1.display();

    return 0;
}