package lecture_04;

import java.util.Scanner;

public class eligibleChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you age: ");
        int age = scanner.nextInt();

        if (age >= 16){
            System.out.println("You are eligible to work");
        }else{
            System.out.println("You are not eligible to work. Minimum age requirement is 16.");
        }
    }
}
