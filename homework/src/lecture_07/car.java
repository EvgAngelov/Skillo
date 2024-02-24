package lecture_07;


public class car {
    private final String name;
    private final String color;
    private final int releaseYear;
    private final int horsePower;
    private final boolean secondHandTick;


    public car(String name, String color, int releaseYear, int horsePower, boolean secondHandTick) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHandTick = secondHandTick;
    }

    public static void main(String[] args) {
        car car1 = new car("ford ","white ", 1991,
                120, true);
        System.out.println(car1.name + " " +car1.color + " " + car1.releaseYear + " " +
                car1.horsePower + " " + car1.secondHandTick);
    }
}