package lecture_05;

public class biggestElementOfArray {
    public static void main(String args[]){
        int [] arr = new int [] {15,25,35,45,55};

        int max = arr [0];

        for (int i = 0; i < arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println("The biggest element present in given array: " + max);
    }
}
