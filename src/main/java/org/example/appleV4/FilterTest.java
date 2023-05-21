package org.example.appleV4;

import org.example.Apple;
import java.util.ArrayList;
import java.util.List;

public class FilterTest {

    static AppleGreenColorPredicate appleGreenColorPredicate;
    static AppleHeavyWeightPredicate appleHeavyWeightPredicate;
    static AppleRedHeavyPredicate appleRedHeavyPredicate;
    static FilterApples filterApples;

    public static void main(String[] args) {
        appleGreenColorPredicate = new AppleGreenColorPredicate();
        appleHeavyWeightPredicate = new AppleHeavyWeightPredicate();
        appleRedHeavyPredicate = new AppleRedHeavyPredicate();
        filterApples = new FilterApples();

        Apple appleA = new Apple(180, "GREEN");
        Apple appleB = new Apple(160, "RED");
        Apple appleC = new Apple(180, "RED");
        Apple appleD = new Apple(80, "RED");


        List<Apple> inventory = new ArrayList<>();
        inventory.add(appleA);
        inventory.add(appleB);
        inventory.add(appleC);
        inventory.add(appleD);

        List<Apple> apples = filterApples.filterApples(inventory, appleGreenColorPredicate);
        List<Apple> apples1 = filterApples.filterApples(inventory, appleHeavyWeightPredicate);
        List<Apple> apples2 = filterApples.filterApples(inventory, appleRedHeavyPredicate);

        for (Apple apple: apples) {
            System.out.println("apple = " + apple);
        }

        for (Apple apple:apples1) {
            System.out.println("apples1 = " + apple);
        }

        for (Apple apple:apples2) {
            System.out.println("apples2 = " + apple);
        }
    }
}
