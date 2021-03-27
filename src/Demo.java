
public class Demo {

    public static int[] compute(int number){
        int square=number*number;
        int cube=square*number;
        
        int data[]={square,cube};
        
        return data;
    }
    
    public static void main(String[] args) {
        int result[]=compute(10);    //we want compute method to return us the square and cube of the given no.
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
