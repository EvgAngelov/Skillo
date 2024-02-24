package ForLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class elemEqualsOfSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a count of integer numbers: ");
        int countNumbers = Integer.parseInt(input.nextLine());

        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 1; i <= countNumbers; i++){
            System.out.println("Enter a numbers: ");
            int number = Integer.parseInt(input.nextLine());
            sum += number;

            if(number > maxNumber){
                maxNumber = number;
            }

        }
        int sumOfAllNumsWithOutMaxNum = sum - maxNumber;
        if(maxNumber == sumOfAllNumsWithOutMaxNum){
            System.out.println("Yes");
            System.out.println("Sum = " + maxNumber);
        }else{
            int diff = Math.abs(maxNumber - sumOfAllNumsWithOutMaxNum);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }

    }
}
