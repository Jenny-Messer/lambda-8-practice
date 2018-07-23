public class Main {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting helloWorldGreeting = new HelloWorldGreeting();

        //replaces helloWorldGreeting
        Runnable lambdaGreeting = () -> System.out.println("Hello World!");

        /*

        Runnable is a functional interface built into java 8
        Runnable takes no args and returns nothing, it just runs what it is given

         */

        //these are two ways of doing the same thing
        helloWorldGreeting.perform();
        lambdaGreeting.run();

    }
}
