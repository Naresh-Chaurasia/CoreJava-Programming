package in.connect2tech.lambda;

@FunctionalInterface
interface Inter1{
    public abstract void m1();

    public default void m2(){
        System.out.println("I am default");
    }
}

public class Sample {
}
