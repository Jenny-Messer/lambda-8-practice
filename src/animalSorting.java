// Copyright (c) 2018 Travelex Ltd

import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class animalSorting {

    public static void main(String[] args) {
        List<String> animalList = Arrays.asList("cat", "dog", "mouse", "rabbit", "cow");

        //non lambda
        Map<Character, List<String>> map = new HashMap<>();

        for(String animal : animalList){

            Character key = animal.charAt(0);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(animal);

        }

        //lambda
        Map<Character, List<String>> map2 = animalList.stream().collect(groupingBy(animal -> animal.charAt(0)));

        System.out.print(map + "\n" + map2);

    }
}
