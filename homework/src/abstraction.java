public class abstraction {
    static void printRow(int figureSize, int starCount) {
        for (int i = 0; i < figureSize - starCount; i++)
            System.out.print(" ");
        for (int col = 1; col < starCount; col++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }

    public static void main(String[] args) {
        printRow(20,3);
    }
}
