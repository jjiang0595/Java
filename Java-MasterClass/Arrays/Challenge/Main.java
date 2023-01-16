package Challenge;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] newArray = getRandomInts(10);

        int[] sortedArray = sortIntegers(newArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] getRandomInts(int len) {
        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i + 1];
                    sortedArray[i + 1] = sortedArray[i];
                    sortedArray[i] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
