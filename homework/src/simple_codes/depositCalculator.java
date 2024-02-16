package simple_codes;

import java.util.Scanner;

//A program that calculates what amount
// you will receive at the end of the deposit period at a certain interest rate

public class depositCalculator {
    public static void main(String[] args) {
        //Input scanner
        Scanner input = new Scanner(System.in);

        //Enter deposited sum from console
        System.out.println("Enter a deposited sum: ");
        double depositedSum = Double.parseDouble(input.nextLine());

        //Enter term of deposited from console
        System.out.println("Enter a term of deposit: ");
        double termDeposit = Double.parseDouble(input.nextLine());

        //Enter annual interest rate from console
        System.out.println("Enter annual interest rate: ");
        double annualInterestRate = Double.parseDouble(input.nextLine());

        //Calculate accrued interest
        double accruedInterest = depositedSum * (annualInterestRate / 100);

        //Calculate accrued interest per one mouth
        double accruedInterestPerMonth = accruedInterest / 12;

        //Calculate total sum
        double totalSum = depositedSum + (termDeposit * accruedInterestPerMonth);

        System.out.println(totalSum);

    }
}
