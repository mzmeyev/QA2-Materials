package Lecture4;

import java.util.Random;
public class Task2 {
// step 1 = print 3 dice result
// step 2 = create loop where all dice will be thrown - dice1 == dice2
// step 3 = condition in loop dice1==dice2==dice3
// step 4 = print how many tries
        public static void main(String[] args) {
            Random randomGenerator = new Random();
            int randomNumber1 = randomGenerator.nextInt(6);
            int dice1;
            int dice2;
            int dice3;
            int numOfRolls = 0;

            do {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            dice3 = (int) (Math.random() * 6) + 1;
                numOfRolls++;
                System.out.println("Dice1 is " + dice1 + " Dice2 is " + dice2 + " Dice3 is " + dice3);
                System.out.println("Number of rolls " + numOfRolls);
            } while (!(dice1 == dice2 && dice2 == dice3 && dice3 == dice1));

        }
    }


