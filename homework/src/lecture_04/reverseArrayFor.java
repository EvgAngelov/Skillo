package lecture_04;

import java.util.Arrays;

public class reverseArrayFor {
        public static void main (String[] args) {
            int[] arr = {10,20,30,40,50};
            StringBuilder reversed = new StringBuilder();

            for (int i = arr.length; i > 0; i--) {
                reversed.append(arr[i - 1]).append(" ");
            };

            String[] reversedArray = reversed.toString().split(" ");

            System.out.println(Arrays.toString(reversedArray));
        }
    }

