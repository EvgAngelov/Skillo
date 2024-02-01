public class pineTree {
    public static void main(String[] args) {
        int height = 10;
        for (int i = 1; i <= height; i++){
            for(int space = 1; space <= height-i; space++){
                System.out.print(" ");
            }
            for (int star = 1; star <= i * 2 - 1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
