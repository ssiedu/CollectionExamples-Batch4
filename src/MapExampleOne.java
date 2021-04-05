
import java.util.TreeMap;


public class MapExampleOne {

    public static void main(String[] args) {

        //HashMap<String,Integer> scores=new HashMap<>();
        //LinkedHashMap<String,Integer> scores=new LinkedHashMap<>();
        TreeMap<String,Integer> scores=new TreeMap<>();
        scores.put("sachin", 50);
        scores.put("virat",40);
        scores.put("ravindra",30);
        System.out.println(scores);
        
        //System.out.println(scores.get("ajinkya"));
        
        
    }
}
