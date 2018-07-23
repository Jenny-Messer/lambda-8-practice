public class Main {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting helloWorldGreeting = new HelloWorldGreeting();

        //replaces helloWorldGreeting
        Runnable lambdaGreeting = () -> System.out.println("Hello World! - lambda");

        /*

        Runnable is a functional interface built into java 8
        Runnable takes no args and returns nothing, it just runs what it is given

        functional interfaces must have only 1 abstract method to be usable by lambdas
        the annotation @FunctionalInterface denotes an interface that must not have more methods added to it

         */


        Greeting innerClassGreeting = new Greeting() {

            public void perform() {
                System.out.println("Hello World! - inner class");
            }
        };

        //these are three ways of doing the same thing
        helloWorldGreeting.perform();
        innerClassGreeting.perform();
        lambdaGreeting.run();

        //using greeter to run also works
        greeter.greet(innerClassGreeting);

    }
}
