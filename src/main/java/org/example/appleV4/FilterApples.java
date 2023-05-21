package org.example.appleV4;

import org.example.Apple;

import java.util.ArrayList;
import java.util.List;

public class FilterApples {

    public List<Apple> filterApples(List<Apple> inventory, ApplePredicate P){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if (P.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
