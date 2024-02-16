package simple_codes;

import java.util.Scanner;

public class fishTank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a length of the fish tank: ");
        int length = Integer.parseInt(input.nextLine());

        System.out.println("Enter a width of the fish tank: ");
        int width = Integer.parseInt(input.nextLine());

        System.out.println("Enter a height of the fish tank: ");
        int height = Integer.parseInt(input.nextLine());

        System.out.println("Enter a occupied percentage of the fish tank");
        double percentageOccupied = Double.parseDouble(input.nextLine());

        double volumeTank = length * width * height;

        double volumeTankInLiters = volumeTank / 1000;

        double neededLiters = volumeTankInLiters * (1 - (percentageOccupied/100));

        System.out.println("Liters needed to fill the fish tank: " + neededLiters);
    }
}
