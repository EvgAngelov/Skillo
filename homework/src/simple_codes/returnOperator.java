package simple_codes;

public class returnOperator {
    static String readFullName(String fName, String lName){
        return fName + " " + lName;
    }

    public static void main(String[] args) {
        System.out.println(readFullName("Evgeni", "Angelov"));
    }
}
