package lecture_06;

public class avgValue {
    static double averageValue(double num1, double num2, double num3) {
        double sum = num1 + num2 + num3;
        double average = sum / 3;
        return average;
    }
    public static void  main(String[] args){
        double result = averageValue(10.5, 15.7, 20.3);
        System.out.println("The average of three numbers is: " + result);
    }
}
