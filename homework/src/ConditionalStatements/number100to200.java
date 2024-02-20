package ConditionalStatements;

import java.util.Scanner;

public class number100to200 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = Integer.parseInt(input.nextLine());

        if(num < 100){
            System.out.println("Less than 100");
        }else if(num >= 100 && num <=200){
            System.out.println("Between 100 and 200");
        }else if(num > 200){
            System.out.println("Greater than 200");
        }
    }
}
