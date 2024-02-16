package simple_codes;

import java.util.Scanner;

public class suppliesForSchool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter count packs of pencils: ");
        int countPacksPencils = Integer.parseInt(input.nextLine());

        System.out.println("Enter count packs of markers: ");
        int countPacksMarkers = Integer.parseInt(input.nextLine());

        System.out.println("Enter liters of detergent: ");
        int litersDetergent = Integer.parseInt(input.nextLine());

        System.out.println("Enter a percentage of discount: ");
        int percentageDiscount = Integer.parseInt(input.nextLine());

        double totalPricePencils = countPacksPencils * 5.80;
        double totalPriceMarkers = countPacksMarkers * 7.20;
        double totalPriceDetergent = litersDetergent * 1.20;

        double sum = totalPricePencils + totalPriceMarkers + totalPriceDetergent;
        double discount = (sum * percentageDiscount) / 100;

        double totalSum = sum - discount;

        System.out.println(totalSum);
    }
}
