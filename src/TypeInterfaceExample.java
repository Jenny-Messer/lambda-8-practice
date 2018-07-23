// Copyright (c) 2018 Travelex Ltd

public interface TypeInterfaceExample {

    static void main(String[] args) {

        //the type of myLambda is determined by the return type of StringLengthLambda.getLength
        StringLengthLambda myLambda = s -> s.length();

        printLambda(myLambda);

    }

    //takes a lambda as input
    static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("Hello Lambda"));
    }

    //defines a lambda function
    interface StringLengthLambda {
        int getLength(String s);
    }

}
