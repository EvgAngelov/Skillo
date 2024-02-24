package Methods;

import java.util.Scanner;

public class example1 {
        public static int positiveNegativeOrNullNum(int num){
            if(num > 0){
                System.out.println("The number " + num + " is positive.");
            }else if(num < 0){
                System.out.println("The number " + num + " is negative.");
            }else if(num == 0){
                System.out.println("The number " + num + " is zero.");
            }
            return num;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int num = Integer.parseInt(input.nextLine());

            positiveNegativeOrNullNum(num);
        }
    }

