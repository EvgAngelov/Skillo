package lecture_06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class middleChar {
    public static void displayMiddleCharacter(String str){
        int length = str.length();
        if(length % 2 == 0) {
            int middle1 = length / 2 - 1;
            int middle2 = length / 2;
            System.out.println("The middle characters of word is: " + str.charAt(middle1) + ", " + str.charAt(middle2));
        }else{
            int middle = length/2;
            System.out.println("Middle character is: " + str.charAt(middle));
        }
    }
    public static int countWords(String str){
        String[] words = str.split("\\s + ");
        return words.length;
    }
    public static void main(String[] args){
        Scanner enterData = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String userInput = enterData.nextLine();

        displayMiddleCharacter(userInput);

        int wordCounter = countWords(userInput);

    }
}
