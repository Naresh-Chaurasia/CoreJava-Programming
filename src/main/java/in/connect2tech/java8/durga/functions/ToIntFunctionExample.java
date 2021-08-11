package in.connect2tech.java8.durga.functions;

import java.util.function.*;

public class ToIntFunctionExample {

    public static void main(String[] args) {
        ToIntFunction <String> stringLength = (s)->s.length();

        System.out.print(stringLength.applyAsInt("Hello"));
    }

}
