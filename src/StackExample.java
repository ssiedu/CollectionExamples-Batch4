import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        String e1="indore", e2="bhopal", e3="ujjain";
        
        //here you wish to store these city names in a stack.
        Stack stk=new Stack();
        stk.push(e1); stk.push(e2); stk.push(e3);
        System.out.println(stk);
        stk.pop();//remove and returns the top most element
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
    }
}
