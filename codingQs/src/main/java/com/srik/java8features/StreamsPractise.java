package com.srik.java8features;

import java.util.function.Function;
import java.util.function.Predicate;

public class StreamsPractise {

    public static void main(String[] args) {
        Function<String, Integer> fn = s -> s.length();
        System.out.println(fn.apply("ssssssssssssssss"));
    }
    public static void main2(String[] args) {
        Predicate<Integer> p = i -> i<10;
        System.out.println(p.test(9));

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Predicate<Integer> p1 = i -> i>10;
        Predicate<Integer> p2 = i -> i%2 == 0;

        System.out.println(">10: ");
        main1(p1, ints);

        System.out.println("Evens:");
        main1(p2, ints);

        System.out.println("<10:");
        main1(p1.negate(), ints);

        System.out.println(">10 and Evens:");
        main1(p1.and(p2), ints);

        System.out.println(">10 or Evens");
        main1(p1.or(p2), ints);
    }

    public static void main1(Predicate<Integer> p , int[] x) {
        for (int i: x){
         if(p.test(i)){
             System.out.println(i);
         }
        }
    }
}
