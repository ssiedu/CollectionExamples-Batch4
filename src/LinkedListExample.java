
import java.util.LinkedList;


public class LinkedListExample {

    public static void main(String[] args) {

        String e1="java",e2="python",e3="php",e4="cpp",e5="spark";
        //here we are storing the elements in linked-list.
        LinkedList list=new LinkedList();
        list.add(e1); list.add(e2); list.add(e3);
        System.out.println(list);
        list.addFirst(e4);
        System.out.println(list);
        list.add(1,e5);
        System.out.println(list);
        //list.removeFirst();
        //list.removeLast();
        list.remove(2);
        System.out.println(list);
    }
}
