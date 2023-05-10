package Homework9;

public class Movie extends Product{
    private String director;

    public Movie() {

    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getType(){
        return "Movie";
    }
    public double getDiscount(){
        return super.getPrice()-(0.5* super.getPrice());
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
