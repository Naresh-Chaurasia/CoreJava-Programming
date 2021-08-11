package in.connect2tech.java8.durga.functions;

import java.util.function.*;

public class FunctionExample {

    public static void main(String[] args) {
        Function <String, String> upperCase = s -> s.toUpperCase();
        System.out.println(upperCase.apply("convert me to upper"));

        Function <String, String> removeSpace = s -> s.replaceAll(" ", "");
        System.out.println(removeSpace.apply("remove - spaces - in - between"));
    }
}
