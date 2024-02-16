package simple_codes;

import java.util.Scanner;

public class projectsCreation {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        System.out.println("Enter a name of the architect: ");
        String name = inputData.nextLine();

        System.out.println("Enter a count of the project: ");
        int countProject = Integer.parseInt(inputData.nextLine());

        int neededTime = 3 * countProject;

        System.out.println("The architect " + name + " will need " + neededTime +
                " hours to complete " + countProject + " project/s");
    }
}
