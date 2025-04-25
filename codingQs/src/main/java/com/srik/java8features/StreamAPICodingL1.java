package com.srik.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamAPICodingL1 {

    public static void main(String[] args) {
        //1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = numbers.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());

        //2 max
        System.out.println(numbers.stream().max(Integer::compare));

        //3 sum
        numbers.stream().mapToInt(Integer::intValue).sum();














        //
        List<String > strList = Arrays.asList("hello", "aaa", "bbb", "ccc");
        System.out.println(""+strList.stream().map(String::toUpperCase).collect(Collectors.toList()));

        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String > strList1 = ArrayList::new; //Arrays.asList("hello", "aaa", "bbb", "ccc");

        List<String> newList = listSupplier.get();
        newList.add("new item");
        System.out.println("New list: " + newList);

    }
}
