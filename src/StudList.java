
import java.util.LinkedList;


public class StudList {
    public static void main(String[] args) {

        Stud s1=new Stud(111,"AAA","CS",3);
        Stud s2=new Stud(112,"BBB","IT",4);
        Stud s3=new Stud(113,"CCC","CIVIL",5);
        Stud s4=new Stud(114,"DDD","MECH",2);
        Stud s5=new Stud(115,"EEE","EC",6);
        
        LinkedList<Stud> list=new LinkedList<>();
        list.add(s1); list.add(s2); list.add(s3); list.add(s4); list.add(s5);
        
        for(Stud s:list){
            s.show();
        }
        
        /*
        for(int i=0; i<list.size(); i++){
            Stud s=list.get(i);
            s.show();
        }
        */
        
        
        
    }
}
