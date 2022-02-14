package com.company;
import java.util.*;
import java.util.Iterator;

public class Zad2 {
    public static <E> void wypiszCoDrugi(Iterable<E> iterable){
        Iterator<E> iter = iterable.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
            iter.next();
            if(iter.hasNext()) System.out.println(",");
        }
        System.out.println("");
    }

    public static void main(String[] args){
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);
        Set<Float> floats = new HashSet<>();
        floats.add(1.0f);
        floats.add(2.0f);
        floats.add(3.0f);
        floats.add(4.0f);
        floats.add(5.0f);
        floats.add(6.0f);
        Queue<Double> doubles = new PriorityQueue<>();
        doubles.add(1.0);
        doubles.add(2.0);
        doubles.add(3.0);
        doubles.add(4.0);
        doubles.add(5.0);
        doubles.add(6.0);
        wypiszCoDrugi(ints);
        wypiszCoDrugi(floats);
        wypiszCoDrugi(doubles);
    }
}
