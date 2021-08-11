package in.connect2tech.java8.durga.predicates;

import java.util.function.*;

public class IntPredicateExamples {

    public static void main(String[] args) {

        IntPredicate intPredicate = i-> i%2 == 0;

        int value=11;
        if(intPredicate.test(value)){
            System.out.print("Even::"+value);
        }else {
            System.out.print("Odd::"+value);
        }

    }

}
