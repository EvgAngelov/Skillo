package lecture_04;

public class numberIterator {
    public static void main(String[] args) {
        int[] list1 = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int number : list1) {
            if (number % 5 == 0) {
                System.out.println(number + " is divisible by 5.");
            }

            if (number > 150) {
                System.out.println("Stopping the loop as we found a number greater than 150.");
                break;
            }
        }
    }
}
