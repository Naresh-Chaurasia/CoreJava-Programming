package in.connect2tech.collections;

import java.util.*;

class MyComparator implements Comparator<Integer>{

    public int compare(Integer o1, Integer o2) {

        if(o1>o2){
            return -1;
        }else if (o1<o2){
            return 1;
        }else {
            return 0;
        }
    }
}

public class ListSorting {

    public static void main(String[] args) {

        List <Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(0);
        l.add(5);
        l.add(20);

        System.out.println(l);
        Collections.sort(l, new MyComparator());
        System.out.println(l);




    }
}
