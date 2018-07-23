public class Main {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();

        //greeter performs an action, helloworldgreeting is an object that holds that action
        greeter.greet(helloWorldGreeting);
    }
}
