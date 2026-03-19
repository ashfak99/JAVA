class BookDetails{
    private String title;
    private String author;
    private double price;

    public BookDetails(String title, String author, double price) {
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void display()
    {
        System.out.println("\tBOOK DETAILS");
        System.out.println("Titel : "+this.title);
        System.out.println("Author : "+this.author);
        System.out.println("Price : "+this.price);
    }
}

public class book {
    public static void main(String[] args) {
        BookDetails book1 = new BookDetails("Kya Bole", "Ashfak Alam", 1000);
        BookDetails book2 = new BookDetails("DSA", "Ashfak Alam", 999);
        BookDetails book3 = new BookDetails("COA", "Ashfak Alam", 1999);
        book1.display();
        book2.display();
        book3.display();
    }
}
