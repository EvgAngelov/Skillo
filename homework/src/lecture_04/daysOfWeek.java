package lecture_04;

import java.util.Scanner;

public class daysOfWeek {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7: ");
        int userInput = scanner.nextInt();

        switch (userInput){

            case 1:
                System.out.println("The " + userInput + "st day of the week is Monday");
                break;
            case 2:
                System.out.println("The " + userInput + "nd day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The " + userInput + "th day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The " + userInput + "th day of the week is Thursday");
                break;
            case 5:
                System.out.println("The " + userInput + "th day of the week is Friday");
                break;
            case 6:
                System.out.println("The " + userInput + "th day of the week is Saturday");
                break;
            case 7:
                System.out.println("The " + userInput + "th day of the week is Sunday");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }
}
