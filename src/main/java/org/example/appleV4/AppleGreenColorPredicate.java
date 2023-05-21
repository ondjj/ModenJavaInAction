package org.example.appleV4;

import org.example.Apple;

import static org.example.Color.*;

public class AppleGreenColorPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return GREEN.equals(apple.getColor());
    }
}
