package Lecture4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random randomVariable = new Random();
        int[] array = new int[10];
        Random rand = new Random();
        System.out.println("My array is " + Arrays.toString(array));

        if (array[0] > array[9]) {
            for (int i = 0; i < array.length; i++)
                array[i] = rand.nextInt(100) + 1;
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
        }else{
            for (int i = array.length - 1; i >= 0; i--)
                System.out.print(array[i] + " ");
            System.out.println();
        }
    }
}