package in.connect2tech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortingLambda {

    public static void main(String[] args) {

        Comparator <Integer> lambdaComparator = (a, b)->{
            if(a>b){
                return -1;
            }else if (a<b){
                return 1;
            }else {
                return 0;
            }
        };

        List <Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(0);
        l.add(5);
        l.add(20);

        System.out.println(l);
        Collections.sort(l, lambdaComparator);
        System.out.println(l);




    }
}
