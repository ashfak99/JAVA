class StringO{
    private String str;

    public StringO(String ipt)
    {
        str=ipt;
    }

    public int findLength()
    {
        return str.length();
    }

    public void compare(StringO other)
    {
        if (this.str==other.str) {
            System.out.println("Both String are equals");
        }
        else{
            System.out.println("Both String are not equals");
        }
    }
}

class myString{
    public static void main(String[] args) {
        StringO str1 = new StringO("Ashfak");
        StringO str2 = new StringO("Alam");
        System.out.println(str1.findLength());
        str1.compare(str2);
    }
}