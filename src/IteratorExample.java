
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("indore");
        cities.add("delhi");
        cities.add("chennai");
        cities.add("pune");
        cities.add("agra");
        
        Iterator<String> it=cities.iterator();
        
        while(true){
            boolean found=it.hasNext();
            if(found==false)break;
            System.out.println(it.next());
        
        }
        
        /*
        for(String city:cities){
            System.out.println(city);
        }
        */
        /*
        for(int i=0; i<cities.size(); i++){
            String city=cities.get(i);
            System.out.println(city);
        }
        */

    }
}
