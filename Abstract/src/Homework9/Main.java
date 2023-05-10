package Homework9;

public class Main {
    public static void main(String[] args) {

        //testing Product abstract
          Book b1 = new Book("Book of wonder",50,"Ahmed");
          Movie m1 = new Movie("Pulp Fiction",50,"Quentin Tarantino");

          System.out.println("Product: "+b1.getType()+"- Name: "+b1.getName()+"- Price: "+b1.getPrice());
          System.out.println("After Discount: "+ b1.getDiscount());
          System.out.println("Product: "+m1.getType()+"- Name: "+m1.getName()+"- Price: "+m1.getPrice());
          System.out.println("After Discount: "+ m1.getDiscount());

//        MoveablePoint m1 = new MoveablePoint(0,0,2,2);
//        m1.moveUp();
//        m1.moveLeft();
//        //TESTING MOVEABLE POINT
//        System.out.println("X position:"+m1.getX()+", Y position:"+m1.getY());
//        m1.moveRight();
//        System.out.println("X position:"+m1.getX()+", Y position:"+m1.getY());


    }
    }
