package Homework9;

public class Book extends Product{
    private String author;

    public Book() {

    }

    public Book(String name, double price,String author) {
        super(name,price);
        this.author = author;
    }

    public String getType(){
        return "Book";
    }

    public double getDiscount(){
        return super.getPrice()-(0.5* super.getPrice());
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
