
import java.util.Stack;


public class GenericCollection {

    public static void main(String[] args) {

        //suppose you wish to manage the stack of string elements only
        
        Stack<String> stk1=new Stack<>();
        stk1.push("abc");
        stk1.push("xyz");
        //stk1.push(10);
        //stk1.push(20);
        System.out.println(stk1);
        
        Stack<Integer> stk2=new Stack<>();
        stk2.push(10);
        stk2.push(20);
        //stk2.push("abc");
        //stk2.push("xyz");
        System.out.println(stk2);
        
        Stack stk3=new Stack();
        stk3.push("abc"); stk3.push("xyz");
        stk3.push(10); stk3.push(20);
        System.out.println(stk3);
        
        
    }
}
