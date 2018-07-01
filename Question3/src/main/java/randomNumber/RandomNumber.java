package randomNumber;

import java.util.*;

public class RandomNumber {

    int[] num = new int[500];


    RandomNumber()
    {
        generateRandomNumber();
        sort();
    }

    private void generateRandomNumber()
    {
        for (int i = 0; i < 500 ; i++) {
            num[i] = ((int)(Math.random()*323)+123);
        }
    }

    private void sort()
    {
        Arrays.sort(num);
    }

    private void printAll()
    {
        for (int i = 0; i < 500; i++){
            System.out.println(num[i]);
        }
    }

    private void printSmallestNumber()
    {
        System.out.println("The smallest number: "+num[0]);
    }


    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        randomNumber.printAll();
        randomNumber.printSmallestNumber();
    }
}
