package simple_codes;

import java.util.Scanner;

public class foodDelivery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter count chicken menu: ");
        int countChickenMenu = Integer.parseInt(input.nextLine());

        System.out.println("Enter count fish menu: ");
        int countFishMenu = Integer.parseInt(input.nextLine());

        System.out.println("Enter count vegan menu: ");
        int countVeganMenu = Integer.parseInt(input.nextLine());

        double menuPrice = (countChickenMenu * 10.35) + (countFishMenu * 12.40) + (countVeganMenu * 8.15);
        double dessertPrice = menuPrice - (menuPrice * 0.80);

        double totalSum = menuPrice + dessertPrice + 2.50;

        System.out.println("Total price of order is: " + totalSum);
    }
}
