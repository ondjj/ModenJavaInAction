package appleV1;

import java.util.ArrayList;
import java.util.List;


public class AppleTest {

    static AppleFancyFormatter appleFancyFormatter;
    static AppleSimpleFormatter appleSimpleFormatter;

    public static void main(String[] args) throws Exception {
        Apple appleA = new Apple(3, "Green");
        Apple appleB = new Apple(2.2, "Red");

        List<Apple> inventory = new ArrayList<>();

        inventory.add(appleA);
        inventory.add(appleB);

        PrettyPrintAppleTest.prettyPrintApple(inventory, appleFancyFormatter);
        PrettyPrintAppleTest.prettyPrintApple(inventory, appleSimpleFormatter);
    }
}
