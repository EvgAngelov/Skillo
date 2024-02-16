package lecture_04;

import java.util.Scanner;

public class calculateRevenue {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter unit price: ");
        int unitPrice = scanner.nextInt();

        System.out.println("Enter quantity: ");
        int quantity = scanner.nextInt();

        int sum = quantity * unitPrice;

        double Discount = 0;

        if(quantity >= 100 && quantity <= 120){
            Discount = sum - (sum * 0.15);
            System.out.println("The revenue from sale: " + (sum - Discount) + "$");
            System.out.println("Discount: " + Discount + "(15.0%)");
        }else if(quantity > 120){
            Discount = sum - (sum * 0.20);
            System.out.println("The revenue from sale: " + (sum - Discount) + "$");
            System.out.println("Discount: " + Discount + "$" + "(20.0%)");
        }else if(quantity < 100){
            System.out.println("The revenue from sale: " + sum + "$");
            System.out.println("Discount: 0%");
        }
    }
}
