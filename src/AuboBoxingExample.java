
import java.util.Stack;


public class AuboBoxingExample {

    public static void main(String[] args) {

        Stack stk=new Stack();
        stk.push("abc");
        stk.push(10);
        stk.push(2.5);
        
        Double d1=(Double)stk.pop();
        System.out.println(d1*5);
        
        Integer i1=(Integer)stk.pop();
        System.out.println(i1/8);
    }
}
