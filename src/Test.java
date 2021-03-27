
import java.util.Scanner;


public class Test {

    public static void main(String[] args) {

        //take 500 numbers inputs from user and print the square of all numbers.
        
        Scanner sc=new Scanner(System.in);
        
        int numbers[]=new int[5];
        
        for(int i=0; i<5; i++){
            System.out.println("Enter Number : "+(i+1));
            numbers[i]=sc.nextInt();
        }
        
        System.out.println("Computing Squares ......");
        
        for(int number:numbers){
            System.out.println("Square of "+number+" => " +number*number);
        }
        
        
        
        
    }
}
