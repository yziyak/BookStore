public class Book {
    private double price;
    private String author;
    private int publishYear;
    private String name;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public Book(String author, String name, int publishYear, double price) {
        this.price = price;
        this.author = author;
        this.publishYear = publishYear;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
