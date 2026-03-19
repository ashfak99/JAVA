class TimeClass{
    private int hours;
    private int minutes;
    private int second;

    public TimeClass(int hr, int min, int sec) {
        this.hours=hr%24;
        this.minutes=min%60;
        this.second=sec%60;
    }

    public void display()
    {
        System.out.println("Hours : Minutes : Seconds");
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, second);
    }
}

public class time {
    public static void main(String[] args) {
        TimeClass ti1=new TimeClass(14, 32, 30);
        TimeClass ti2 = new TimeClass(6, 50, 36);

        ti1.display();
        ti2.display();
    }
}
