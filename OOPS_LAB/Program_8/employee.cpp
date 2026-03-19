#include<print>
#include<iostream>
using namespace std;

class employee
{
    private:
        string empId;
        string empName;
        float basicSalary;
        float hra=0.3;
        float da=0.4;

    public:

        employee(string id,string name, float salary) : empId(id),empName(name),basicSalary(salary){}

        double grossSalary() const{
            return basicSalary+(hra*basicSalary)+(da*basicSalary);
        }

        void display()
        {
            println("Id : {}",empId);
            println("Name : {}",empName);
            println("\tSALARY");
            println("Basic Salary : {}",basicSalary);
            println("HRA : {}",basicSalary*hra);
            println("DA : {}",basicSalary*da);
            println("Total Salary : {}",grossSalary());
        }
};


int main(int argc, char const *argv[])
{
    employee emp1("CSE253004","ASHFAK ALAM",5800);
    emp1.display();
    return 0;
}