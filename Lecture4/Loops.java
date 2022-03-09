package Lecture4;

public class Loops {
    public static void main(String[] args) {
        int myIndex = 0;
        while (myIndex < 1000000) {
            System.out.println("Element i= " + myIndex);
            myIndex++; //myIndex = myIndex + 1;
            if (myIndex == 10) {
                break;
            }
        }
    }

}

