package lecture_05;

public class changingArray {
    public static void main(String[] args){
        String[] carBrands = {"Audi", "Volskwagen", "Porsche", "Skoda"};
        carBrands[1] = "BMW";
        System.out.println(carBrands[1]);
    }
}
