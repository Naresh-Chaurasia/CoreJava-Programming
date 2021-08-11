package in.connect2tech.java8.durga.streams;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.*;

class ArrayListExample {

    static int n = 5;
    static ArrayList<Integer> arrli
            = new ArrayList<Integer>(n);

    public static void main(String[] args) {

        Predicate<Integer> getEvenNumber = value -> value%2==0;
        Consumer<Integer> displayValue = (value) -> System.out.println(value);

        createList();

        arrli.stream().filter(value -> value%2==0).forEach(displayValue);

        List <Integer> list = arrli.stream().filter(value -> value%2==0).collect(Collectors.toList());


    }

    public static void createList() {
        for (int i = 1; i <= n; i++)
            arrli.add(i);
    }
}