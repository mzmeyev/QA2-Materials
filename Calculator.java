import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner value_a = new Scanner(System.in);
        Scanner value_b = new Scanner(System.in);


        System.out.println("Enter number a: ");
        int number1 = value_a.nextInt();
        if (number1 > 4){
            System.out.println("Invalid number, Try again");
            System.exit(0);
        }else if(number1 < 1){
            System.out.println("Invalid number, Try again");
            System.exit(0);
        }

        System.out.println("Enter number b: ");
        int number2 = value_b.nextInt();
        if (number2 > 4){
            System.out.println("Invalid number, Try again");
            System.exit(0);
        }else if(number2 < 1){
            System.out.println("Invalid number, Try again");
            System.exit(0);
        }

        System.out.println("Entered numbers are: " + number1 + " and " + number2);

        Scanner action = new Scanner(System.in);
        System.out.println("Please select your action: +, -, *, /");
        String option = action.next();

        if (option.equals("+")) {
            System.out.println("Sum of number a and number b is " + (number1 + number2));
        }
        if (option.equals("-")) {
            System.out.println("Subtraction of number a and number b is " + (number1 - number2));
        }
        if (option.equals("*")) {
            System.out.println("Multiplication of number a and number b is " + (number1 * number2));
        }
        if (option.equals("/")) {
            System.out.println("Division of number a and number b is " + (number1 / number2));
        } else {
            System.out.println("Please enter a valid action");
        }
    }



}
