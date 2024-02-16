package lecture_06;

public class smallestNumFinder {

    // Method to find the smallest number among three numbers
    static int findSmallest(int num1, int num2, int num3) {
        // Assuming num1 is the smallest initially
        int smallest = num1;
        // Compare num2 with the current smallest
        if (num2 < smallest) {
            smallest = num2;
        }
        // Compare num3 with the current smallest
        if (num3 < smallest) {
            smallest = num3;
        }
        // Return the smallest number
        return smallest;
    }
    public static void main(String[] args) {
        // Example usage:
        int result = findSmallest(15, 8, 20);
        System.out.println("The smallest number is: " + result);
    }
}

