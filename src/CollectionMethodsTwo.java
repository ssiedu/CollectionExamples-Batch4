
import java.util.ArrayList;


public class CollectionMethodsTwo {

    public static void main(String[] args) {

        ArrayList<String> csStuds=new ArrayList<>();
        ArrayList<String> itStuds=new ArrayList<>();
        ArrayList<String> allStuds=new ArrayList<>();
        
        csStuds.add("AA"); csStuds.add("BB");
        itStuds.add("XX"); itStuds.add("YY");
        System.out.println(csStuds);
        System.out.println(itStuds);
        System.out.println(allStuds);
        System.out.println("___________________________________");
        allStuds.addAll(csStuds);//all the elements of csStuds will be coppied to allStuds
        allStuds.addAll(itStuds);//all the elements of itStuds will be copied to allStuds
        System.out.println(csStuds);
        System.out.println(itStuds);
        System.out.println(allStuds);
        System.out.println("___________________________________");
        allStuds.clear();
        //allStuds.retainAll(itStuds);
        //allStuds.removeAll(itStuds);
        //all the elements which exists in csStuds will be removed from allStuds
        System.out.println(allStuds);
        
        
        
        
        
    }
}
