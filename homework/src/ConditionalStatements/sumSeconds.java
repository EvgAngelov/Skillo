package ConditionalStatements;

import java.util.Scanner;

public class sumSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a first time: ");
        int time1 = Integer.parseInt(input.nextLine());

        System.out.println("Enter a second time: ");
        int time2 = Integer.parseInt(input.nextLine());

        System.out.println("Enter a third time: ");
        int time3 = Integer.parseInt(input.nextLine());

        int totalTimeInSec = time1 + time2 + time3;

        int minutes = totalTimeInSec / 60;
        int seconds = totalTimeInSec % 60;

        if(seconds < 10){
            System.out.printf("%d:0%d", minutes, seconds);
        }else{
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
