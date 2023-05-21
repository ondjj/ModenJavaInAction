package org.example.appleV5;

import org.example.Apple;

import java.util.ArrayList;
import java.util.List;

import static org.example.Color.RED;
import static org.example.appleV5.Filters.filter;

public class FilterTest {
    public static void main(String[] args) {

        Apple appleA = new Apple(180, "GREEN");
        Apple appleB = new Apple(160, "RED");
        Apple appleC = new Apple(180, "RED");
        Apple appleD = new Apple(80, "RED");

        List<Apple> inventory = new ArrayList<>();
        inventory.add(appleA);
        inventory.add(appleB);
        inventory.add(appleC);
        inventory.add(appleD);

        List<Apple> redApples = filter(inventory, (Apple apple) -> RED.equals(apple.getColor()));
    }
}
