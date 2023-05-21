package org.example.appleV4;

import org.example.Apple;
import org.example.Color;

import static org.example.Color.*;

public class AppleRedHeavyPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return RED.equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
