package lecture_07;


//Create a Car class which has 5 attributes name / color / release year / horsepower / second hand tick.
//        Name and color must be from string type / release year and horsepower to be integers / second hand is boolean.
//        Requirements:
//        • If name or color is not specified set N/A as value
//        • If release year or horsepower is not specified set -1 as value
//        • If second hand is not specified set false as value
//        Create a constructors of Car class for the following cases:
//        • Create a car by provided name / color / release year / horsepower / second hand
//        • Create a car by provided name / color / second hand
//        • Create a car by provided name / color / release year / horsepower
//        • Create a car by provided name / release year / horsepower / second hand
//        • Create a car by provided nothing
//        Create Car object using each constructor
public class car {
    private String name;
    private String color;
    private int releaseYear;
    private int horsePower;
    private boolean secondHandTick;

    public car(String name, String color, int releaseYear, int horsePower, boolean secondHandTick) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHandTick = secondHandTick;
    }

    public car(String name, String color, boolean secondHandTick) {
        this(name, color, -1, -1, secondHandTick);
    }

    public car(String name, String color, int releaseYear, int horsePower){
        this(name, color, releaseYear, horsePower, false);
    }

    public car(String name, int releaseYear, int horsePower, boolean secondHandTick){
        this(name, "N/A", releaseYear, horsePower, secondHandTick);
    }

    public car(int releaseYear, int horsePower, boolean secondHandTick){
        this("N/A", "N/A", 1991, horsePower, secondHandTick);
    }

    public car() {
    }
    public int getReleaseYear(){
        return this.releaseYear;
    }


}