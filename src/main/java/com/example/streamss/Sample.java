package com.example.streamss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,8,9);
        long evenNumbers = nums.stream().filter(num -> num % 2 == 0).count();
        Stream<Integer> doubledValue = nums.stream().map(n-> n*2);
        List<Integer>doubledValue1 = nums.stream()
                .map(n-> n*2)
                 .collect(Collectors.toList());
       // evenNumbers.forEach(System.out::println);
        //nums.forEach(n-> System.out.println(n));
        doubledValue1.forEach(System.out::println);
       // System.out.println(evenNumbers);

    }
}
