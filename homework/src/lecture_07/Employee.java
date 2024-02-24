package lecture_07;

public class Employee {
    private String firstName = null;
    private String lastName = null;
    private int birthYear = 0;

    public Employee(String first, String last, int year){
        firstName = first;
        lastName = last;
        birthYear = year;
    }

    public static void main(String[] args) {
        Employee person1 = new Employee("Penio", "Gatev", 28);
        Employee person2 = new Employee("Gatio", "Penev", 23);
        Employee person3 = new Employee("Natali", "Trifonova", 33);
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.birthYear);
    }
}
