class DATEFORMATE {
    private int day;
    private int month;
    private int year;

    public DATEFORMATE(int dd, int mm, int yyyy) {
        day = dd;
        month = mm;
        year = yyyy;
    }

    public boolean ValidateDate() {
        if (year < 1 || year > 9999 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }

        if (month == 2) {
            boolean isLeap = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
            if (isLeap) {
                return (day <= 29);
            } else {
                return (day <= 28);
            }
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return (day <= 30);
        }

        return true;
    }

    public void Display() {
        System.out.printf("%02d/%02d/%04d\n", day, month, year);
    }
}

public class date {
    public static void main(String[] args) {
        DATEFORMATE d1 = new DATEFORMATE(29, 2, 2023);
        
        if (d1.ValidateDate()) {
            System.out.print("Date is Valid: ");
            d1.Display();
        } else {
            System.out.println("Date is Invalid!");
        }
    }
}