
public class AutoBoxingUnBoxingExample {

    public static void square(int n){
        System.out.println(n*n);
    }
    
    public static void show(Object obj) {

    }

    public static void main(String[] args) {
        show("abc");
        show(10);       //show(new Integer(10));  //autoboxing
        show(2.5);      //show(new Double(2.5)); //autoboxing
        
        Integer ob=new Integer(5);
        square(ob); //square(ob.intValue())         //autounboxing
        
    }
}
