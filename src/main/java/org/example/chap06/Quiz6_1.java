package org.example.chap06;

import static java.util.stream.Collectors.reducing;
import static org.example.chap06.Dish.menu;

public class Quiz6_1 {
    public static void main(String[] args) {
        String shortMenu1 = menu.stream().map(Dish::getName)
                .collect(reducing((s1, s2) -> s1 + s2)).get();

//        String shortMenu3 = menu.stream()
//                .collect(reducing((d1, d2) -> d1.getName() + d2.getName())).get();

        String shortMenu2 = menu.stream().collect(reducing("", Dish::getName, (s1, s2) -> s1 + s2));
    }
}
