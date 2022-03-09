package Lecture2;

import java.util.Random;

public class Excercise1 {

    public static void main(String[] args) {
//        String name = "Mihail";
//        System.out.println("Hello, my name is " + name);
//        int a = 10;
//        int b = 4;
//        double result = a /(double) b;
//        System.out.println("result is " + result);

        Random randomVariable = new Random();
        int randomNumber1 = randomVariable.nextInt(101);
        System.out.println("Random number is " + randomNumber1);

        int randomNumber2 = randomVariable.nextInt(101);
        System.out.println("Random number is " + randomNumber2);

        int randomNumber3 = randomVariable.nextInt(101);
        System.out.println("Random number is " + randomNumber3);

        int result = randomNumber1 + randomNumber2 + randomNumber3;
        System.out.println("Result is " + result);

    }
}
