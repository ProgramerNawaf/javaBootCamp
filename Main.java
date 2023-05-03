import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //exer1
//        for(int i =1 ; i<=100 ; i++) {
//
//            if(i%3 ==0)
//                System.out.println("Fizz");
//
//            if(i%5 == 0)
//                System.out.println("Buzz");
//
//            if(i%3 ==0 && i%5 == 0)
//                System.out.println("FizzBuzz");
//        }
        //exer2
//        System.out.println("Input a string");
//        String word = s.nextLine();
//        for(int i = word.length()-1; i>=0 ; i--){
//            System.out.print(word.charAt(i));
//        }
        //exer3
//        System.out.println("Input a number");
//        int num = s.nextInt();
//        for(int i = 1; i<=10 ; i++){
//            System.out.println((num*i));
//        }

        //exer4
//        System.out.println("Input a number");
//        int num1 = s.nextInt();
//        for(int i = num1-1; i>=1 ; i--){
//            num1=num1*i;
//        }
//        System.out.println(num1);

        //exer5
//       System.out.print("Input first number:");
// 		 int number = s.nextInt(); 
// 		 int fact=1;
// 		  for(int i=1;i<=number;i++){    
// 		      fact=fact*i;    
// 		  }    
// 		  System.out.println("Factorial is: "+fact); 

        //exer6
//        int odd=0;
//        int even=0;
//        int nummm=0;
//        while(true){
//            System.out.println("Input number");
//            nummm= s.nextInt();
//
//            if(nummm%2==0)
//               even+=nummm;
//            else
//               odd+=nummm;
//
//            System.out.println("even is "+even);
//            System.out.println("odd is "+odd);
//        }

        //exer7
//           System.out.println("Input number");
//           int number= s.nextInt();
//           boolean flag = true;
//           if(number <=1)
//               System.out.println("not prime");
//
//           for(int i = number-1 ; i>1 ; i--){
//               if(number%i == 0){
//                   System.out.println("not prime");
//                   flag = false;
//                   break;
//               }
//
//           }
//           if(flag)
//           System.out.println("prime");
//

        //exer8
//        System.out.println("How many numbers you want to enter");
//        int numbers= s.nextInt();
//        int numbb,postive=0,negative=0,zeros=0;
//
//        while(numbers-- >0){
//            System.out.println("enter a number");
//            numbb= s.nextInt();
//
//            if(numbb>0)
//                postive++;
//            else if(numbb <0)
//                negative++;
//            else
//                zeros++;
//        }
//        System.out.println("postive = "+postive+", negative= "+negative+", zeros= "+zeros);

        //exer9
//        for(int i =1 ; i<5 ; i++) {
//            System.out.println("Week "+i);
//            for(int j =1 ; j<8 ; j++){
//                System.out.println("Day "+j);
//            }
//        }

            //exer10
//            System.out.println("Input String");
//            String word= s.nextLine();
//            boolean flag = true;
//            char c1;
//            char c2;
//            int j =word.length()-1;
//            for(int i= 0 ; i<j/2 -1 ; i++){
//                c1= word.charAt(i);
//                c2= word.charAt(j);
//                if(c1 == c2)
//                    continue;
//                else {
//                    System.out.println("not a palindrome ");
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag)
//                System.out.println("palindrome ");

    }
}
