package Methods;

import java.util.Objects;
import java.util.Scanner;

public class orders {
    public static void ordersInfo(String product, int quantity){
        double totalSum = 0;

        switch (product){
            case "coffee":
            totalSum = quantity * 1.50;
                System.out.printf(product + " = 1.50$ / piece\n");
                System.out.println("x " + quantity + " = " + totalSum + "$");
                break;
            case "water":
                totalSum = quantity * 1;
                System.out.printf(product + " = 1$ / piece\n");
                System.out.println("x " + quantity + " = " + totalSum + "$");
                break;
            case "coke":
                totalSum = quantity * 1.40;
                System.out.printf(product + " = 1.40$ / piece\n");
                System.out.println("x " + quantity + " = " + totalSum + "$");
                break;
            case "snacks":
                totalSum = quantity * 2;
                System.out.printf(product + " = 2$ / piece\n");
                System.out.println("x " + quantity + " = " + totalSum + "$");
                break;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a product (coffee, water, coke or snacks): ");
        String product = input.nextLine();
        if((!Objects.equals(product,"coffee")) && (!Objects.equals(product,"water")) &&
                (!Objects.equals(product,"coke")) && (!Objects.equals(product,"snacks"))) {
            throw new RuntimeException("Please, enter exist product (coffee, water, coke, snacks)");
        }

        System.out.println("Enter a quantity: ");
        int quantity = Integer.parseInt(input.nextLine());

        ordersInfo(product,quantity);

    }
}
