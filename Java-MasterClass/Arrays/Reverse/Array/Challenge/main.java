package Reverse.Array.Challenge;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] numList = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numList));
        reverse(numList);
        System.out.println(Arrays.toString(numList));
    }

    public static void reverse(int[] numList) {
        int l = 0;
        int r = numList.length - 1;

        while (l <= r) {
            int temp = numList[l];
            numList[l] = numList[r];
            numList[r] = temp;
            l += 1;
            r -= 1;
        }
    }
}
