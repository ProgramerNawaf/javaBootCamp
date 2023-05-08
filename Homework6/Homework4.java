import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class HomeWork4 {
    public static void main(String[] args) {
 
        //exer7
        Scanner s = new Scanner(System.in);


        int option;
        System.out.println("Whats the size of the array:");
        int size = s.nextInt();
        int[] numbers = new int[size];
        int entry;
        boolean flag;
        do{
            System.out.println("1- Accept elements of an array:");
            System.out.println("2- Display elements of an array:");
            System.out.println("3- Search the element within array:");
            System.out.println("4- Sort the array:");
            System.out.println("5- To Stop:");
            option = s.nextInt();

            if(option == 1) {
                    int i = 0;
                    if(numbers[numbers.length-1] !=0) {
                        System.out.println("Array is full");
                        continue;
                    }
                    do {
                        System.out.println("Add a number: ");
                        entry = s.nextInt();
                        numbers[i]=entry;
                    }while(i++ != numbers.length-1);
            }else if (option == 2){
                for(int i = 0 ; i< numbers.length; i++){
                        System.out.println( numbers[i]+ " ,");
                }

            }
            else if (option == 3){
                try {
                System.out.println("Whats the number: ");
                entry = s.nextInt();
                flag=false;
                for(int i = 0 ; i< numbers.length ; i++){
                    if(numbers[i]  == entry){
                        System.out.println(entry +" exist in index "+  numbers[i]);
                        flag=true;
                    }
                }

                    if (!flag)
                        throw new Exception("The number dosent exist");
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    System.out.println(e.getClass());
                    System.out.println();
                }
            }else if (option == 4){
                int temp;
                for(int i = 0 ; i < numbers.length-1; i++){
                    for(int j = 0 ; j< numbers.length-1; j++) {
                        if (numbers[j + 1] == -1)
                            break;
                        if (numbers[j] > numbers[j + 1]) {
                            temp = numbers[j + 1];
                            numbers[j + 1] = numbers[j];
                            numbers[j] = temp;
                        }
                    }
                }
            }
        }while(option !=5);

    





    }
}
