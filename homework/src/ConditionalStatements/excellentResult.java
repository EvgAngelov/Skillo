package ConditionalStatements;

import java.util.Scanner;

public class excellentResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a grade: ");
        int grade = Integer.parseInt(input.nextLine());

        switch (grade){
            case 2:
                System.out.println("Poor");
                break;
            case 3:
                System.out.println("Middle");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Very good");
                break;
            case 6:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Error! Enter a grade between 2 - 6!");
        }
    }
}
