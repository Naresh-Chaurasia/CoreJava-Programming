package in.connect2tech.java8.durga.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class ArrayListExampleMap {

    static int n = 5;
    static ArrayList<Integer> arrli
            = new ArrayList<Integer>(n);

    public static void main(String[] args) {

        Predicate<Integer> getEvenNumber = value -> value%2==0;
        Consumer<Integer> displayValue = (value) -> System.out.println(value);
        Function<Integer, Integer> doubleValue = (value)->value*2;

        createList();

        //List <Integer> doubleValueList = arrli.stream().map(doubleValue).collect(Collectors.toList());
        //doubleValueList.forEach(displayValue);

        arrli.stream().map(doubleValue).forEach(displayValue);

        


    }

    public static void createList() {
        for (int i = 1; i <= n; i++)
            arrli.add(i);
    }
}