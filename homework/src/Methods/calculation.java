package Methods;

import java.util.Objects;
import java.util.Scanner;

public class calculation {
    public static void calculationMethod(String action, int num1, int num2){
        int value = 0;
        if(Objects.equals(action, "add")){
            value = num1 + num2;
            System.out.println("The value of adding is: " + value);
        }else if(Objects.equals(action, "multiply")){
            value = num1 * num2;
            System.out.println("The value of multiplying is: " + value);
        }else if(Objects.equals(action, "subtract")){
            value = num1 - num2;
            System.out.println("The value of subtracting is: " + value);
        }else if(Objects.equals(action, "divide")){
            value = num1 / num2;
            System.out.println("The value of dividing is: " + value);
        }else {
            System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter action: ");
        String action = input.nextLine();
        if((!Objects.equals(action, "add")) && (!Objects.equals(action, "multiply")) && (!Objects.equals(action, "subtract")) &&
                (!Objects.equals(action, "divide"))){
            throw new RuntimeException("Enter a valid operator (add, multiply, subtracting or " +
                    "divide)");
        }

        System.out.println("Enter the first number: ");
        int num1 = Integer.parseInt(input.nextLine());

        System.out.println("Enter the second number: ");
        int num2 = Integer.parseInt(input.nextLine());

        calculationMethod(action, num1, num2);
    }
}
