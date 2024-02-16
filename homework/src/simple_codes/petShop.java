package simple_codes;

import java.util.Scanner;

public class petShop {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        System.out.println("Еnter number of dog food packages: ");
        int countDogPacks = Integer.parseInt(inputData.nextLine());

        System.out.println("Еnter number of cat food packages: ");
        int countCatPacks = Integer.parseInt(inputData.nextLine());

        double sumDogFood = countDogPacks * 2.50;
        int sumCatFood = countCatPacks * 4;

        System.out.println(sumCatFood + sumDogFood);
    }
}
