// Copyright (c) 2018 Travelex Ltd

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class exercise1 {

    public static void main(String[] args){

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        //sort list by last name

        //non lambda
        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //lambda version
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //print

        //non lambda
        for (Person p : people){
            System.out.println(p);
        }

        //lambda
        printConditionally(people, p -> true);

        //create method that prints all people that have last name beginning with C

        printConditionally(people, p -> p.getFirstName().startsWith("C"));


    }

    /*
    Predicate<Person> is a lambda that takes 1 argument of type Person
    and has the method test() which returns a boolean
    */
    private static void printConditionally(List<Person> people, Predicate<Person> condition){
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }

}
