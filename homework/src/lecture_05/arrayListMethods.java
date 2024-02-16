package lecture_05;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListMethods {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");      //adding element in ArrayList
        cars.add("Opel");
        cars.add("BMW");
        cars.add("Chrysler");

        cars.set(1, "Mercedes");        //change element
        cars.remove(2);     //remove element

        System.out.println(cars);
        System.out.println(cars.get(0));

        for(String i : cars){
            System.out.println(i);
        }
        Collections.sort(cars);

        for(String i : cars){
            System.out.println(i);
        }
    }
}
