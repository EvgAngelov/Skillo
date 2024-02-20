package ConditionalStatements;

import java.util.Objects;
import java.util.Scanner;

public class passwordGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String pass = input.nextLine();

        if(Objects.equals(pass, "s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong password!");
        }
    }
}
