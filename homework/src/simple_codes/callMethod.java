package simple_codes;

public class callMethod {
    static void printStudents(String name, int age, double grade){
        System.out.println("Student: " +  name + " is " + age + "-years old and his grade is " + grade);
        }

    public static void main(String[] args) {
        printStudents("George", 27,5);
    }
}



