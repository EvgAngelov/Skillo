package lecture_06;

import java.util.Scanner;

public class complexMethods {
    static void ageChecker (int age){
        if(age < 18){
            System.out.println("Access denied - You are not old enough!");
        }else{
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args){
        Scanner enterAge = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int userAge = enterAge.nextInt();
        ageChecker(userAge);
        enterAge.close();
    }
}
