package simple_codes;

import java.util.Scanner;

public class yardGreening {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        System.out.println("Enter a square meters: ");
        double squareMeters = Integer.parseInt(inputData.nextLine());

        double squareMetersPrice = 7.61 * squareMeters;

        double discountPrice = squareMetersPrice - (squareMetersPrice*0.18);

        System.out.println("The final price is: " + discountPrice + " lv.");
        System.out.println("The discount is: " + (squareMetersPrice - discountPrice) + " lv.");
    }
}
