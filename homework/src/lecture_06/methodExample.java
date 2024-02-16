package lecture_06;

public class methodExample {
    static void myMethod(String fname, int age){
        System.out.println(fname + " is " + age );
    }
    public static void main(String[] args){
        myMethod("Joro", 15);
        myMethod("Peshko", 25);
        myMethod("Gancho", 35);
    }
}
