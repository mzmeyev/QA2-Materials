package Lecture2;

public class Excercise2 {


    public static void main(String[] args) {
        Bank bankVariables = new Bank();
        Bank bankVariable = new Bank();
        bankVariable.checkBalance();
        bankVariable.deposit(10000);
        bankVariable.checkBalance();
        bankVariable.withdraw(1000);
        bankVariable.checkBalance();


    }
}
