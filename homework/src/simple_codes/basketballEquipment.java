package simple_codes;

import java.util.Scanner;

public class basketballEquipment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter annual fee: ");
        int annualFee = Integer.parseInt(input.nextLine());

        double sneakersPrice = annualFee - (annualFee * 0.40);
        double equipPrice = sneakersPrice - (sneakersPrice * 0.20);
        double ballPrice = equipPrice / 4;
        double accessoriesPrice = ballPrice / 5;

        double totalSum = annualFee + sneakersPrice + equipPrice + ballPrice + accessoriesPrice;

        System.out.println("Total sum of equipment and annual fee is: " + totalSum);
    }
}
