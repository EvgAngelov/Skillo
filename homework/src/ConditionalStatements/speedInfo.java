package ConditionalStatements;

import java.util.Scanner;

public class speedInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a speed: ");
        double speed = Double.parseDouble(input.nextLine());

        if(speed <= 10){
            System.out.println("slow");
        }else if(speed > 10 && speed <=50){
            System.out.println("average");
        }else if(speed > 50 && speed <= 150){
            System.out.println("fast");
        }else if(speed > 150 && speed <= 1000){
            System.out.println("ultra fast");
        }else if(speed > 1000){
            System.out.println("extremely fast");
        }
    }

}
