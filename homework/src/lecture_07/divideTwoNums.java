package lecture_07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class divideTwoNums {
    public static void main(String[] args) {
        int firstNumber, lastNumber;
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter the first number: ");
            firstNumber = input.nextInt();

            System.out.println("Enter the second number: ");
            lastNumber = input.nextInt();

        }catch (InputMismatchException e){
            e.printStackTrace();
            throw new RuntimeException("Please enter valid numeric values.");
        }
        System.out.println("Result of division is: " + divideNumbers(firstNumber, lastNumber));
        }

        public static int divideNumbers(int x, int y){
            try {
                return x / y;
        }catch (ArithmeticException e){
                e.printStackTrace();
                throw new RuntimeException("Cannot divide by 0!");
            }
    }
}
