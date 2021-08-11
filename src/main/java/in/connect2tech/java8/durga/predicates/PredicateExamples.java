package in.connect2tech.java8.durga.predicates;

import java.util.function.Predicate;

public class PredicateExamples {

    public static void main(String[] args) {

        /*Predicate <String> predicate1 = s->s.length()>3;
        Predicate <String> predicate2 = s->s.length()<10;

        System.out.println(predicate1.and(predicate2).test("a"));
        System.out.println(predicate1.and(predicate2).test("abcd"));
        System.out.println(predicate1.and(predicate2).test("abcdefghijklmno"));*/


        /*Predicate <String> startsWithK = s->s.charAt(0) == 'K';

        String s = "Kali";
        if(startsWithK.test(s)){
            System.out.print(s);
        }*/

        /*Predicate <String> isNull = s->s == null;

        String s = null;
        if(isNull.test(s)){
            System.out.print("This is null value::"+s);
        }*/

    }

}
