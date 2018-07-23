public class Main {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting helloWorldGreeting = new HelloWorldGreeting();

        //replaces helloWorldGreeting
        Runnable lambdaGreeting = () -> System.out.println("Hello World! - lambda");

        /*

        Runnable is a functional interface built into java 8
        Runnable takes no args and returns nothing, it just runs what it is given

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

    }
}
