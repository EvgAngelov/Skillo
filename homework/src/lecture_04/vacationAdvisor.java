package lecture_04;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class vacationAdvisor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of vacation (Beach/Mountain): ");
        String vacantionType = scanner.nextLine();

        System.out.println("Enter the budget per day per person: ");
        double budgetPerDay = scanner.nextDouble();

        if(vacantionType == "Beach"){
            if(budgetPerDay < 50){
                System.out.println("Consider vacationing in Bulgaria.");
            }else{
                System.out.println("Consider vacationing outside Bulgaria.");
            }
        }else if("Mountain".equalsIgnoreCase(vacantionType)){
            if(budgetPerDay < 30){
                System.out.println("Consider vacationing in Bulgaria.");
            }else{
                System.out.println("Consider vacationing outside Bulgaria.");
            }
        }
    }
}
