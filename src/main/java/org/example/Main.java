package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    numberList.stream()
        .filter(v -> v<=5)
        .forEach(System.out::println);

    numberList.stream()
        .limit(3)
        .forEach(System.out::println);

     double oddNumber = numberList.stream()
         .filter(v -> v % 2 == 1)
         .mapToDouble(Integer::doubleValue)
         .average()
         .orElse(0.0);

     System.out.println(oddNumber);




     List<String> studentList = Arrays.asList("aa","b","abc","c","dd","ee","f","ggg","hhhh","i");

    List<String> studentLists = studentList.stream()
        .filter(v -> v.length()>=2)
        .map(String::toUpperCase)
        .toList();

    System.out.println(studentLists);





  }
}