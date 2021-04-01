public class Stud {
    private int rno;
    private String name;
    private String branch;
    private int sem;

    public Stud(int rno, String name, String branch, int sem) {
        this.rno = rno;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
    }
    
    public void show(){
        System.out.println(rno+","+name+","+branch+","+sem);
    }
}
