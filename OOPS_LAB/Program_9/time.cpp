#include<iostream>
#include<print>
using namespace std;

class Time{
    int hours;
    int minute;
    int second;

  public:
    Time(int hr, int min, int sec):hours(hr),minute(min),second(sec){}

    void display()
    {
        println("{:02}:{:02}:{:02}", hours, minute, second);
    }
};

int main(int argc, char const *argv[])
{
    Time t1(2,5,9);
    t1.display();
    return 0;
}