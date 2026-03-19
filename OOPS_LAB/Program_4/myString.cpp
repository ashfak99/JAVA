#include<iostream>
using namespace std;

class MyString{
    private:
        string str;
    public:
        MyString()
        {
            str="";
        }

        MyString(string ipt)
        {
            str=ipt;
        }

        int StringLength()
        {
            int count=0;
            while (str[count] != '\0')
            {
                count++;
            }

            return count;
        }

        void CompareString(MyString other)
        {
            if (this->StringLength()==other.StringLength())
            {
                cout<<"String has equal length"<<endl;
            }
            else{
                cout<<"String does not have equal length"<<endl;
            }
        }
};

int main(int argc, char const *argv[])
{
    MyString *str = new MyString("Ashf");
    MyString *str2 = new MyString("Alam");
    cout<<str->StringLength();
    cout<<endl;
    str->CompareString(*str2);
    return 0;
}