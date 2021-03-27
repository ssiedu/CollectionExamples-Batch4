
import java.util.LinkedList;
import java.util.Scanner;

public class Trial {
     public static void main(String[] args) {

        //take 500 numbers inputs from user and print the square of all numbers.
        
        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
        while(true){
            System.out.println("Enter a Number : (0) to exit ");
            int n=sc.nextInt();
            if(n==0)break;
            list.add(n);
        }
        
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        
        
        
    }
}
