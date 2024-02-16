package lecture_06;

public class Palindrome {
    public static boolean isNumberPalindrome(int number) {
        if (number < 0) {
            throw new RuntimeException("The number should be positive!");
        }
        int original = number;
        int reverse = 0;

        // Construct the reverse number
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return original == reverse;
    }

    public static boolean isNumberPalindrome2(int number) {
        if (number < 0) {
            throw new RuntimeException("The number should be positive!");
        }
        String numberAsString = Integer.toString(number);

        int numberDigits = numberAsString.length();
        for (int i = 0 ; i < numberDigits / 2; i++) {
            if (numberAsString.charAt(i) != numberAsString.charAt(numberDigits - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int number = 35;  // Replace this with the number you want to check

        boolean isPalindrome1 = isNumberPalindrome(number);
        boolean isPalindrome2 = isNumberPalindrome2(number);

        System.out.println("Using isNumberPalindrome: " + isPalindrome1);
        System.out.println("Using isNumberPalindrome2: " + isPalindrome2);
    }
}
