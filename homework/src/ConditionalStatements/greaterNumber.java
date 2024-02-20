package ConditionalStatements;

import java.util.Scanner;

public class greaterNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int num1 = Integer.parseInt(input.nextLine());

        System.out.println("Enter a second number: ");
        int num2 = Integer.parseInt(input.nextLine());

        if(num1 > num2){
            System.out.println("Number " + num1 + " is greater than number " + num2);
        }else if(num1 < num2){
            System.out.println("Number " + num2 + " is greater than number " + num1);
        }
    }
}
