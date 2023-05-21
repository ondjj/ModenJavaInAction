package appleV1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PrettyPrintAppleTest {
    @Test
    @DisplayName("유연한 prettyPrintApple 메서드 구현하기")
    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) throws Exception{

        for (Apple apple : inventory){
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }
}
