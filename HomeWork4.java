import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class HomeWork4 {
    public static void main(String[] args) {
        //exer1
//        int [] numbers = {50, -20, 0, 30, 40, 60, 10};
//        if(numbers.length <3)
//            System.out.println(false);
//        if(numbers[0] == numbers[numbers.length-1])
//            System.out.println(true);
//        else
//            System.out.println(false);

        //exer2
//        int [] numbers = {1, 4, 17, 7, 1005, 3, 100};
//        int biggest=0;
//        for(int number : numbers){
//            if(number>biggest)
//                biggest=number;
//        }
//        System.out.println(biggest);

        //exer3
//        int [] numbers = {1, 4, 17, 7, 25, 3, 100};
//        int sum=0;
//
//        for(int number : numbers){
//            sum+=number;
//        }
//        int avg=sum/ numbers.length;
//        for(int number : numbers){
//            if(number>avg)
//                System.out.println(number);;
//        }

        //exer4
//        int [] numbers = {20, 30, 40};
//
//        if(numbers[0] > numbers[numbers.length-1])
//            System.out.println(numbers[0]);
//        else
//            System.out.println(numbers[numbers.length-1]);

        //exer5
//        int [] numbers = {20, 30, 40};
//        int [] numbers1= new int[numbers.length];
//        int temp;
//        numbers1[0]=numbers[numbers.length-1];
//        numbers1[numbers1.length-1]=numbers[0];
//        for(int number : numbers1){
//            System.out.println(number);
//        }

        //exer6
//        String [] words = { "cat", "dog", "red", "is", "am" };
//        int longest=0;
//        for(String word : words){
//           if(word.length()>longest)
//               longest = word.length();
//        }
//
//        for(String word : words){
//            if(word.length()==longest)
//                System.out.print(word+" ");
//        }
//        Scanner s = new Scanner(System.in);
        //exer7

//        int option;
//        System.out.println("Whats the size of the array:");
//        int size = s.nextInt();
//        int[] numbers = new int[size];
//        int entry;
//        boolean flag;
//        do{
//            System.out.println("1- Accept elements of an array:");
//            System.out.println("2- Display elements of an array:");
//            System.out.println("3- Search the element within array:");
//            System.out.println("4- Sort the array:");
//            System.out.println("5- To Stop:");
//            option = s.nextInt();
//
//            if(option == 1) {
//                    int i = 0;
//                    if(numbers[numbers.length-1] !=0) {
//                        System.out.println("Array is full");
//                        continue;
//                    }
//                    do {
//                        System.out.println("Add a number: ");
//                        entry = s.nextInt();
//                        numbers[i++]=entry;
//                    }while(i != numbers.length);
//            }else if (option == 2){
//                for(int i = 0 ; i< numbers.length; i++){
//                        System.out.println( numbers[i]+ " ,");
//                }
//
//            }else if (option == 3){
//                System.out.println("Whats the number: ");
//                entry = s.nextInt();
//                flag=false;
//                for(int i = 0 ; i< numbers.length ; i++){
//                    if(numbers[i]  == entry){
//                        System.out.println(entry +" exist in index "+  numbers[i]);
//                        flag=true;
//                    }
//                }
//                if(!flag)
//                    System.out.println("dosent exist");
//            }else if (option == 4){
//                int temp;
//                for(int i = 0 ; i < numbers.length-1; i++){
//                    for(int j = 0 ; j< numbers.length-1; j++) {
//                        if (numbers[j + 1] == -1)
//                            break;
//                        if (numbers[j] > numbers[j + 1]) {
//                            temp = numbers[j + 1];
//                            numbers[j + 1] = numbers[j];
//                            numbers[j] = temp;
//                        }
//                    }
//                }
//            }
//        }while(option !=5);

        //exer8
//        ArrayList arr = new ArrayList();
//        arr.add(1);
//        arr.add(1);
//        arr.add(1);
//        arr.add(3);
//        arr.add(3);
//        arr.add(5);
//        System.out.println("Enter a number");
//        int entry = s.nextInt();
//        int occurrences = Collections.frequency(arr, entry);
//        System.out.println(occurrences);

        //exer9
//        int[] numbers = {2,3,40,1,5,9,4,10,7};
//        int temp;
//             for(int i = 0 ; i < numbers.length-1; i++){
//                    for(int j = 0 ; j< numbers.length-1; j++) {
//                        if (numbers[j + 1] == -1)
//                            break;
//                        if (numbers[j] % 2 == 0 && numbers[j + 1] % 2 == 0)
//                            continue;
//                        if (numbers[j] % 2 == 0 && numbers[j + 1] % 2 != 0) {
//                            temp = numbers[j + 1];
//                            numbers[j + 1] = numbers[j];
//                            numbers[j] = temp;
//                        }
//                    }
//
//                    }
//             for(int number: numbers)
//                 System.out.print(number +" ,");
        //exer10
//        ArrayList arr = new ArrayList();
//        arr.add(1);
//        arr.add(1);
//        arr.add(1);
//        arr.add(3);
//        arr.add(3);
//        arr.add(5);
//        ArrayList arr1 = new ArrayList();
//        arr1.addAll(arr);
//        System.out.println(arr1.equals(arr));






    }
}
