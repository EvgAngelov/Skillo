package ConditionalStatements;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.Math.round;

public class areaOfFigures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a figure: ");
        String fig = input.nextLine();

        System.out.println("Enter a length of figure: ");
        double length = Double.parseDouble(input.nextLine());

        double area = 0;

        if(Objects.equals(fig, "square")){
            area = length * length;
            System.out.printf("%.3f", + area);
        }else if(Objects.equals(fig, "rectangle")){
            System.out.println("Enter a wide: ");
            double wide = Double.parseDouble(input.nextLine());
            area = length * wide;
            System.out.printf("%.3f", + area);
        }else if(Objects.equals(fig,"circle")){
            area = Math.PI * (length * length);
            System.out.printf("%.3f", + area);
        }else if(Objects.equals(fig, "triangle")){
            System.out.println("Enter a wide: ");
            double wide = Double.parseDouble(input.nextLine());
            area = (length * wide) / 2;
            System.out.printf("%.3f", + area);
        }
    }
}
