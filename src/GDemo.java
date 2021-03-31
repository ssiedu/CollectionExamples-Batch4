
public class GDemo<T> {

    public void disp(T p) {//this disp method has a parameter of generic type (general) , any obect can configure it as per req.
        System.out.println(p);
    }

    public static void main(String[] args) {

        GDemo<Integer> ob1=new GDemo<Integer>();
        ob1.disp(10);
        //ob1.disp("abc");
        
        GDemo<String> ob2=new GDemo<>();
        ob2.disp("abc");
        //ob2.disp(10);
        
        GDemo ob3=new GDemo();
        ob3.disp("xyz");
        ob3.disp(20);
    }
}
