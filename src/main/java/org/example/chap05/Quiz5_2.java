package org.example.chap05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz5_2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> squares = numbers.stream().map(n -> n*n).collect(Collectors.toList());

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> pairs =
                numbers1.stream()
                        .flatMap(i ->
                                numbers2.stream()
                                        .filter(j -> (i+j)%3 == 0)
                                .map(j -> new int[]{i,j}))
                                .collect(Collectors.toList());


    }
}
