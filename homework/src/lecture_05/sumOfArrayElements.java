package lecture_05;
public class sumOfArrayElements {
    public static void main(String[] args){
        int[] nums = {15, 35, 45};
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }
}
