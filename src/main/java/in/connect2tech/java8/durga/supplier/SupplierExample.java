package in.connect2tech.java8.durga.supplier;

import java.util.function.Supplier;
import java.util.Date;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Date> displayDate = ()-> new Date();
        System.out.println(displayDate.get());
    }
}
