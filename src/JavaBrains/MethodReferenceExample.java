// Copyright (c) 2018 Travelex Ltd

package JavaBrains;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample {

    public static void main(String[] args) {

        /*
        static method

        MethodReferenceExample::printMessage
        ==
        () -> printMessage()
         */

        Thread t = new Thread(MethodReferenceExample::printMessage);
        t.start();


        // ---

            List<Person> people = Arrays.asList(
                    new Person("Charles", "Dickens", 60),
                    new Person("Lewis", "Carroll", 42),
                    new Person("Thomas", "Carlyle", 51),
                    new Person("Charlotte", "Bronte", 45),
                    new Person("Matthew", "Arnold", 39)
            );

            /*
            instance method
            .out is an instance

            instance :: methodname

            p -> System.out.println(p)
            ==
            System.out::println

             */

            System.out.println("printing all persons");
            performConditionally(people, p -> true, p -> System.out.println(p));


    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {

        for (Person p : people){
            if (predicate.test(p)){
                consumer.accept(p);
            }
        }

    }

    public static void printMessage() {
        System.out.println("Hello");
    }

}
