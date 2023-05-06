import java.sql.SQLOutput;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println((int)Math.floor(Math.random() *(9 - 1 + 1) + 1));

        String[][] arr = new String[3][3];
        int option;
        System.out.println(" |  |  | \n" +
                "----------- \n" +
                " |  |  | \n" +
                "----------- \n" +
                " |  |  | \n" +
                "----------- ");



        while((game(arr,s))){


        }
    }


    public static boolean game(String[][] arr,Scanner s) {

        int option;
        System.out.println("Where would you like to play (1-9)!");
        option = s.nextInt();

        int playerOptionRow;
        int playerOptionColumn;
        while (true) {
            if (option == 1 && arr[0][0] == null) {
                arr[0][0] = "x";
                break;
            } else if (option == 2 && arr[0][1] == null) {
                arr[0][1] = "x";
                break;
            } else if (option == 3 && arr[0][2] == null) {
                arr[0][2] = "x";
                break;
            } else if (option == 4 && arr[1][0] == null) {
                arr[1][0] = "x";
                break;
            } else if (option == 5 && arr[1][1] == null) {
                arr[1][1] = "x";
                break;
            } else if (option == 6 && arr[1][2] == null) {
                arr[1][2] = "x";
                break;
            } else if (option == 7 && arr[2][0] == null) {
                arr[2][0] = "x";
                break;
            } else if (option == 8 && arr[2][1] == null) {
                arr[2][1] = "x";
                break;
            } else if (option == 9 && arr[2][2] == null) {
                arr[2][2] = "x";
                break;
            } else {
                System.out.println("invalid option! Try again!");
                option = s.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] != null)
                    System.out.print(arr[i][j]);
                System.out.print("   |   ");

            }
            System.out.println();
//            System.out.println("----------- ");
        }

        if (arr[0][0] == "x" && arr[0][1] == "x" && arr[0][2] == "x" || arr[0][0] == "x" && arr[1][0] == "x" && arr[2][0] == "x") {
            System.out.println("Congrats you won");
            return false;
        }
        if (arr[1][0] == "x" && arr[1][1] == "x" && arr[1][2] == "x" || arr[0][1] == "x" && arr[1][1] == "x" && arr[2][1] == "x") {
            System.out.println("Congrats you won");
            return false;
        }
        if (arr[2][0] == "x" && arr[2][1] == "x" && arr[2][2] == "x" || arr[0][2] == "x" && arr[1][2] == "x" && arr[2][2] == "x") {
            System.out.println("Congrats you won");
            return false;
        }
        if (arr[0][0] == "x" && arr[1][1] == "x" && arr[2][2] == "x" || arr[0][2] == "x" && arr[1][1] == "x" && arr[2][1] == "x") {
            System.out.println("Congrats you won");
            return false;
        }

        int computerOption;

        while(true){
            computerOption = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
        if (computerOption == 1 && arr[0][0] == null) {
            arr[0][0] = "O";
            break;
        } else if (computerOption == 2 && arr[0][1] == null) {
            arr[0][1] = "O";
            break;
        } else if (computerOption == 3 && arr[0][2] == null) {
            arr[0][2] = "O";
            break;
        } else if (computerOption == 4 && arr[1][0] == null) {
            arr[1][0] = "O";
            break;
        } else if (computerOption == 5 && arr[1][1] == null) {
            arr[1][1] = "O";
            break;
        } else if (computerOption == 6 && arr[1][2] == null) {
            arr[1][2] = "O";
            break;
        } else if (computerOption == 7 && arr[2][0] == null) {
            arr[2][0] = "O";
            break;
        } else if (computerOption == 8 && arr[2][1] == null) {
            arr[2][1] = "O";
            break;
        } else if (computerOption == 9 && arr[2][2] == null) {
            arr[2][2] = "O";
            break;
        }
    }
        System.out.println("Computer Chose "+ computerOption);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(arr[i][j]!= null)
                    System.out.print(arr[i][j]);
                System.out.print("   |   ");

            }
            System.out.println();
//            System.out.println("----------- ");
        }



        if(arr[0][0] == "O" && arr[0][1] == "O" && arr[0][2] == "O" || arr[0][0] == "O" && arr[1][0] == "O" && arr[2][0] == "O" ){
            System.out.println("Computer Won Good Luck Next Time");
            return false;
        }
        if(arr[1][0] == "O" && arr[1][1] == "O" && arr[1][2] == "O" || arr[0][1] == "O" && arr[1][1] == "O" && arr[2][1] == "O"){
            System.out.println("Computer Won Good Luck Next Time");
            return false;
        }
        if(arr[2][0] == "O" && arr[2][1] == "O" && arr[2][2] == "O" || arr[0][2] == "O" && arr[1][2] == "O" && arr[2][2] == "O" ){
            System.out.println("Computer Won Good Luck Next Time");
            return false;
        }
        if(arr[0][0] == "O" && arr[1][1] == "0" && arr[2][2] == "0" || arr[0][2] == "O" && arr[1][1] == "0" && arr[2][1] == "O"){
            System.out.println("Computer Won Good Luck Next Time");
            return false;
        }
        return true;
    }
}
