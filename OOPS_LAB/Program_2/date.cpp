#include<iostream>
using namespace std;

class DATE{
    private:
        int day;
        int month;
        int year;
    public:
        DATE()
        {
            day=0;
            month=0;
            year=0;
        }

        DATE(int dd, int mm, int yyyy)
        {
            day=dd;
            month=mm;
            year=yyyy;
        }

        bool ValidateDate()
        {
            if (this->day<=0 && this->day>31)
            {
                return false;
            }
            if (this->day<=0 && this->month>12)
            {
                return false;
            }
            if (this->year<=0 && this->year>9999)
            {
                return false;
            }
            
            if (this->month==2)
            {
                if (this->year%4==0)
                {
                    if (this->day>29)
                    {
                        return false;
                    }
                }
                else{if (this->day>28)
                    {
                        return false;
                    }}
            }
            return true;
        }

        void display()
        {
            cout<<this->day<<"/"<<this->month<<"/"<<this->year<<endl;
        }
};

int main(int argc, char const *argv[])
{
    DATE* d1 = new DATE(29,2,2001);
    if(d1->ValidateDate())
    {
        cout<<"\nDate is valid"<<endl;
        d1->display();
    }
    else{
        cout<<"\nDate is invalid";
    }
    return 0;
}
