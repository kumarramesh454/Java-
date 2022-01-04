package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ArrayList<String> list =new ArrayList<String>(Arrays.asList(
//                "a1", "b1", "c2", "c1"));
//        list.stream()
//                .filter(s -> s .startsWith("c"))
//                .map(String::toUpperCase)
//                .sorted()
//                .forEach(System.out::println);


     //skip
//        ArrayList<String> list =new ArrayList<String>(Arrays.asList(
//                "a1", "b1", "c2", "c1"));
//          list.stream()
//                  .skip(3)
//                  .forEach(System.out::println);

//        limit
        ArrayList<String> list =new ArrayList<String>(Arrays.asList(
                "a1", "b1", "c2", "c1"));
        list.stream()
                .limit(2)
                .forEach(System.out::println);

    }
}





public class Main {
    public ArrayList<Integer> length(ArrayList<String> list){
        ArrayList<Integer> output = null;
        list.stream().filter(s -> s.contains("ABS")||s.contains("abs")).forEach(s -> output.add(s.length()));
        return output;
    }
