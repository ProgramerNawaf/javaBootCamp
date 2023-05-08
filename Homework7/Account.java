public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(){

    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        System.out.println(this.toString());
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit (int amount ) {
        try{
        if(this.balance == 0 ) {
            throw new Exception("Can not credit !Account has zero Balance");
        }
            this.balance -= amount;
            return balance;

        }catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }

    }
    public int debit (int amount ){
        this.balance +=amount;
        return balance;
    }

    public int TransferTo(Account another , int amount ){

        another.debit(amount);
        this.credit(amount);
        System.out.println(this.toString());
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account: " +

                "name=" + name +
                ", balance=" + balance ;
    }
}
