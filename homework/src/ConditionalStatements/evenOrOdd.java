package ConditionalStatements;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = Integer.parseInt(input.nextLine());

        if(num % 2 == 0){
            System.out.println("The number is even.");
        }else{
            System.out.println("The number is odd.");
        }
    }
}
