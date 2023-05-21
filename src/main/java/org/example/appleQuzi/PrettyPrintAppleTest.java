package org.example.appleQuzi;

import org.example.Apple;

import java.util.List;

public class PrettyPrintAppleTest {

    public void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) throws Exception{

        for (Apple apple : inventory){
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }
}
