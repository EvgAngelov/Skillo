package lecture_04;

public class largestNumber {
    public static void main(String[] args) {
        // Example array, you can replace it with your own array
        int[] numbers = {10, 5, 8, 20, 15};

        // Initialize the variable to store the largest number
        int largestNumber = numbers[0];

        // Iterate through the array to find the largest number
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }

        // Print the result
        System.out.println("The largest number in the array is: " + largestNumber);
    }
}
