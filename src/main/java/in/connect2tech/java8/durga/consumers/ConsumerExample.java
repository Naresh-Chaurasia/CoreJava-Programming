package in.connect2tech.java8.durga.consumers;

import  java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer <String> displayConsumer = s->System.out.print(s);

        displayConsumer.accept("Hello World");

    }
}
