package org.example.chap05;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PracticalTraining {

    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario", "Milan");
    Trader alan = new Trader("Alan", "Cambridge");
    Trader brian = new Trader("Brian", "Cambridge");

    List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    public static void main(String[] args) {
        PracticalTraining tr = new PracticalTraining();
        List<Transaction> tr2011 =
                tr.transactions.stream()
                        .filter(transaction -> transaction.getYear() == 2011)
                        .sorted(comparing(Transaction::getValue))
                        .collect(toList());

        List<String> cities =
                tr.transactions.stream()
                        .map(transaction -> transaction.getTrader().getCity())
                        .distinct()
                        .collect(toList());

        List<Trader> traders =
                tr.transactions.stream()
                        .map(Transaction::getTrader)
                        .filter(trader -> trader.getCity().equals("Cambridge"))
                        .distinct()
                        .sorted(comparing(Trader::getName))
                        .collect(toList());

        String traderStr =
                tr.transactions.stream()
                        .map(transaction -> transaction.getTrader().getName())
                        .distinct()
                        .sorted()
                        .reduce("", (n1, n2) -> n1 + n2);

        boolean milanBased =
                tr.transactions.stream()
                        .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));


                tr.transactions.stream()
                        .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                        .map(Transaction::getValue)
                        .forEach(System.out::println);

        Optional<Integer> highestValue =
                tr.transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(Integer::max);

        Optional<Transaction> smallestTransaction =
                tr.transactions.stream()
                        .reduce((t1, t2) ->
                                t1.getValue() < t2.getValue() ? t1 : t2);

        Optional<Integer> minValue =
                tr.transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(Integer::min);
    }

}
