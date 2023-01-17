package Minimum.Element.Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int minNum = findMin(returnedArray);
        System.out.println("THE MIN NUM IS " + minNum);
    }

    public static int[] readIntegers() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter list of numbers");
        String numList = s.nextLine();

        String[] newNumList = numList.split(",");
        int[] values = new int[newNumList.length];

        for (int i = 0; i < newNumList.length; i++) {
            values[i] = Integer.parseInt(newNumList[i].trim());
        }
        return values;
    }

    public static int findMin(int[] array) {
        int temp = array[0];

        for (int num : array) {
            if (num < temp) {
                temp = num;
            }
        }
        return temp;
    }
}
