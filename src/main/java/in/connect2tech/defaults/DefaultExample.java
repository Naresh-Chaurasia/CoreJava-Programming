package in.connect2tech.defaults;


interface DefaultInterface{

    public default void  defaultMethod(){
        System.out.println("I am default");
    }
}

public class DefaultExample implements DefaultInterface{

    public static void main(String[] args) {
        DefaultExample d = new DefaultExample();
        d.defaultMethod();
    }
}
