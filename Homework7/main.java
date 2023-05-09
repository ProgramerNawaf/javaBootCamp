import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

          //Employee testing
//        Employee e1 = new Employee("22","Nawaf",50);
//        System.out.println(e1.getAnnualSalary());
//        System.out.println(e1.getSalary());
//        e1.raisedSalary(50);
//        System.out.println(e1.getSalary());

        //Account testing

    //Nawaf 50  , faisal 0
    Account a1 = new Account("11", "Nawaf", 50);
    Account a2 = new Account("22", "faisal");
    System.out.println(a1.toString() + " " + a2.toString());
    System.out.println("------------------");

    System.out.println(a1.getBalance());
    System.out.println(a2.getBalance());
    System.out.println("------------------");
    //Nawaf 25  , faisal 10
    a1.credit(25);
    a2.debit(10);
    a1.getBalance();
    a2.getBalance();
    System.out.println("------------------");
    //Nawaf 0  , faisal 35
    a1.TransferTo(a2, 25);
    a2.getBalance();
    System.out.println("------------------");
    //Nawaf cant credit or transfer because he has no balance
    a1.credit(10);
    a1.TransferTo(a2, 10);
    System.out.println("------------------");
    //Faisal trying to credit or transfer when he dosent have enough balance
    a2.credit(100);
    a2.TransferTo(a1, 100);
    System.out.println("------------------");
    //trying to transfer to a null account
    Account a3=null;
    a2.TransferTo(a3,50);



    }
}
