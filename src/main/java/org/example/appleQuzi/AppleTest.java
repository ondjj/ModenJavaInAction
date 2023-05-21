package org.example.appleQuzi;

import org.example.Apple;

import java.util.ArrayList;
import java.util.List;


public class AppleTest {
    static AppleFancyFormatter appleFancyFormatter;
    static AppleSimpleFormatter appleSimpleFormatter;
    static PrettyPrintAppleTest prettyPrintAppleTest;

    public static void main(String[] args) throws Exception {

        prettyPrintAppleTest = new PrettyPrintAppleTest();
        appleFancyFormatter = new AppleFancyFormatter();
        appleSimpleFormatter = new AppleSimpleFormatter();

        Apple appleA = new Apple(80, "Green");
        Apple appleB = new Apple(220, "Red");

        List<Apple> inventory = new ArrayList<>();

        inventory.add(appleA);
        inventory.add(appleB);

        prettyPrintAppleTest.prettyPrintApple(inventory, appleFancyFormatter);
        System.out.println();
        prettyPrintAppleTest.prettyPrintApple(inventory, appleSimpleFormatter);
    }
}
