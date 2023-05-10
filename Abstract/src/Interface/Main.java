package Interface;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Supervisor s1 = new Supervisor("Nawaf",'m',true,3);
//        s1.display();
//        System.out.println("------------------");
//        Employee e1 = new Employee("nuha",'f',false,"cs");
//        e1.display();
//        System.out.println("------------------");
//        Person p1 = e1;
//        p1.display();
//        p1.getName();
//        System.out.println("------------------");
        //initlize
        Arabic a1 = new Arabic();
        English e1 = new English();
        Spanish s1 = new Spanish();

        System.out.println("language: "+a1.getName() + ", Number of contries that speak it: "+a1.numOfContries() );
        System.out.println("language: "+e1.getName() + ", Number of contries that speak it: "+e1.numOfContries() );
        System.out.println("language: "+s1.getName() + ", Number of contries that speak it: "+s1.numOfContries() );
        //languages info
    }
}