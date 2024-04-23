import java.util.Scanner;

public class Main {
    private int number = 0;
    public Main(){
    }
    public Main(int theNumber){
        this.number = theNumber;
    }

    public static void main(String[] args) {
        Main newObject = new Main(5);
        System.out.println(newObject.number);
    }
}