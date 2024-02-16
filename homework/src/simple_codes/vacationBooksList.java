package simple_codes;

import java.util.Scanner;

public class vacationBooksList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a count pages: ");
        int countPages = Integer.parseInt(input.nextLine());

        System.out.println("Enter a count pages read per one hour: ");
        int pagesPerOneHour = Integer.parseInt(input.nextLine());

        System.out.println("Enter a count of days in which has read the book: ");
        int countDays = Integer.parseInt(input.nextLine());

        int totalTimeToReadOneBook = countPages / pagesPerOneHour;
        int neededHoursToReadOneBook = totalTimeToReadOneBook / countDays;

        System.out.println(neededHoursToReadOneBook);
    }
}
