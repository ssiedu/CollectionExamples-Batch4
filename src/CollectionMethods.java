
import java.util.ArrayList;


public class CollectionMethods {

    public static void main(String[] args) {

        ArrayList<String> items=new ArrayList<>();
        //boolean res=items.isEmpty();
        //System.out.println(res);
        items.add("java");
        items.add("php");
        items.add("python");
        System.out.println(items);
        System.out.println(items.contains("php"));
        items.remove("php");
        System.out.println(items);
        System.out.println(items.contains("php"));
//        int n=items.size();
//        System.out.println(n);
//        boolean res1=items.isEmpty();
//        System.out.println(res1);
        
    }
}
