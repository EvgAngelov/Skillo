package simple_codes;

import java.util.Scanner;

public class repainting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a needed quantity nylon: ");
        int neededNylon = Integer.parseInt(input.nextLine());

        System.out.println("Enter a needed liters paint: ");
        int neededPaint = Integer.parseInt(input.nextLine());

        System.out.println("Enter a needed liters thinner: ");
        int neededThinner = Integer.parseInt(input.nextLine());

        System.out.println("Enter a work hours: ");
        int hours = Integer.parseInt(input.nextLine());

        double priceNylon = (neededNylon + 2) * 1.50;
        double pricePaint = (neededPaint + (neededPaint * 0.10)) * 14.50;
        double priceThinner = neededThinner * 5;

        double totalSum = priceNylon + pricePaint + priceThinner + 0.40;

        double priceWorkPerOneHour = (totalSum - (totalSum * 0.70)) * hours;

        System.out.println(totalSum + priceWorkPerOneHour);
    }
}
